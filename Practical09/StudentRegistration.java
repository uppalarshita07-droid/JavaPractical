import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class StudentRegistration extends Applet implements ActionListener {

    Label nameLabel, rollLabel, emailLabel, phoneLabel, courseLabel;
    TextField nameField, rollField, emailField, phoneField, courseField;
    Button register;

    public void init() {

        setLayout(new GridLayout(6, 2, 10, 10));

        nameLabel = new Label("Student Name:");
        nameField = new TextField(20);

        rollLabel = new Label("Roll Number:");
        rollField = new TextField(20);

        emailLabel = new Label("Email:");
        emailField = new TextField(20);

        phoneLabel = new Label("Phone Number:");
        phoneField = new TextField(20);

        courseLabel = new Label("Course:");
        courseField = new TextField(20);

        register = new Button("Register");
        register.addActionListener(this);

        add(nameLabel);
        add(nameField);
        add(rollLabel);
        add(rollField);
        add(emailLabel);
        add(emailField);
        add(phoneLabel);
        add(phoneField);
        add(courseLabel);
        add(courseField);
        add(new Label(""));
        add(register);
    }


    public void actionPerformed(ActionEvent e) {

        String name = nameField.getText();
        String roll = rollField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();
        String course = courseField.getText();

        if (name.isEmpty() || roll.isEmpty() || email.isEmpty()
                || phone.isEmpty() || course.isEmpty()) {

            JOptionPane.showMessageDialog(this,
                    "Please fill all the fields!");
            return;
        }

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/StudentDB?sslMode=DISABLED&allowPublicKeyRetrieval=true",
                    "root",
                    "**********"
            );

            String query = "INSERT INTO StudentRegistration "
                    + "(name, roll_no, email, phone, course) "
                    + "VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setString(2, roll);
            ps.setString(3, email);
            ps.setString(4, phone);
            ps.setString(5, course);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(this,
                    "Student registered successfully!");

            ps.close();
            con.close();

        } catch (Exception ex) {

            ex.printStackTrace();

            JOptionPane.showMessageDialog(this,
                    "Error: " + ex.getMessage());
        }
    }

}
