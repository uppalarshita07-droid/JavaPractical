import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class LoginApplet extends Applet implements ActionListener {

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
        String name = nameField.getText();

        showStatus("Welcome, " + name);
    }
}