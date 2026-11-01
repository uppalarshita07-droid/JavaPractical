import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class LoginAppletJDBC extends Applet implements ActionListener {

    Label nameLabel, passLabel;
    TextField nameField, passField;
    Button submit;

    public void init() {
        setLayout(new GridLayout(3, 2, 10, 10));

        nameLabel = new Label("Name:");
        nameField = new TextField(20);

        passLabel = new Label("Password:");
        passField = new TextField(20);
        passField.setEchoChar('*');

        submit = new Button("Submit");
        submit.addActionListener(this);

        add(nameLabel);
        add(nameField);
        add(passLabel);
        add(passField);
        add(new Label(""));
        add(submit);
    }

    public void actionPerformed(ActionEvent e) {

        System.out.println("Submit button clicked!");

        String name = nameField.getText();
        String password = passField.getText();

        try {
            System.out.println("Loading JDBC driver...");

            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Connecting to database...");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/LoginDB?sslMode=DISABLED&allowPublicKeyRetrieval=true",
                    "root",
                    "**********"
            );

            System.out.println("Database connected!");

            String query = "INSERT INTO Users (name, password) VALUES (?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setString(2, password);

            int result = ps.executeUpdate();

            System.out.println("Rows inserted: " + result);

            JOptionPane.showMessageDialog(this,
                    "Data stored successfully!");

            ps.close();
            con.close();

        } catch (Exception ex) {

            System.out.println("ERROR OCCURRED:");
            ex.printStackTrace();

            JOptionPane.showMessageDialog(this,
                    ex.toString(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
