import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class StudentLogin1 extends Applet
        implements ActionListener {

    Label nameLabel, passLabel, status;
    TextField nameField, passField;
    Button insert, view, update, delete;

    Connection con;

    public void init() {
        setLayout(new GridLayout(5, 2, 10, 10));

        nameLabel = new Label("Name:");
        nameField = new TextField(20);

        passLabel = new Label("Password:");
        passField = new TextField(20);
        passField.setEchoChar('*');

        insert = new Button("Insert");
        view = new Button("View");
        update = new Button("Update");
        delete = new Button("Delete");

        status = new Label("Enter details");

        add(nameLabel);
        add(nameField);
        add(passLabel);
        add(passField);
        add(insert);
        add(view);
        add(update);
        add(delete);
        add(status);

        insert.addActionListener(this);
        view.addActionListener(this);
        update.addActionListener(this);
        delete.addActionListener(this);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/LoginDB",
                    "root", "**********"
            );
        } catch (Exception e) {
            status.setText("Database connection failed");
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText().trim();
        String password = passField.getText();

        try {
            if (con == null || con.isClosed()) {
                status.setText("No database connection");
                return;
            }

            if (e.getSource() == insert) {
                PreparedStatement ps = con.prepareStatement(
                        "INSERT INTO Users(name,password) VALUES(?,?)");
                ps.setString(1, name);
                ps.setString(2, password);

                ps.executeUpdate();
                ps.close();
                status.setText("Record inserted");
            }

            else if (e.getSource() == view) {
                PreparedStatement ps = con.prepareStatement(
                        "SELECT name FROM Users WHERE name=?");
                ps.setString(1, name);

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    nameField.setText(rs.getString("name"));
                    status.setText("Record found");
                } else {
                    status.setText("Record not found");
                }

                rs.close();
                ps.close();
            }

            else if (e.getSource() == update) {
                PreparedStatement ps = con.prepareStatement(
                        "UPDATE Users SET password=? WHERE name=?");
                ps.setString(1, password);
                ps.setString(2, name);

                int rows = ps.executeUpdate();
                ps.close();

                status.setText(rows > 0 ?
                        "Record updated" : "Record not found");
            }

            else if (e.getSource() == delete) {
                PreparedStatement ps = con.prepareStatement(
                        "DELETE FROM Users WHERE name=?");
                ps.setString(1, name);

                int rows = ps.executeUpdate();
                ps.close();

                status.setText(rows > 0 ?
                        "Record deleted" : "Record not found");
            }

        } catch (Exception ex) {
            status.setText("Operation failed");
            ex.printStackTrace();
        }
    }

    public void destroy() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}