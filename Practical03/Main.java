import java.awt.*;
import java.awt.event.*;

public class Main extends Frame implements ActionListener {

    TextField t1, t2, t3;
    Button b1, b2, b3, b4, b5;

    public Main() {
        setTitle("Calculator");
        setSize(350, 300);
        setLayout(new FlowLayout());

        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);
        t3.setEditable(false);

        b1 = new Button("+");
        b2 = new Button("-");
        b3 = new Button("*");
        b4 = new Button("/");
        b5 = new Button("Clear");

        add(new Label("First Number:"));
        add(t1);
        add(new Label("Second Number:"));
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(new Label("Result:"));
        add(t3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double result = 0;

            if (e.getSource() == b1)
                result = a + b;
            else if (e.getSource() == b2)
                result = a - b;
            else if (e.getSource() == b3)
                result = a * b;
            else if (e.getSource() == b4) {
                if (b == 0) {
                    t3.setText("Cannot divide by zero");
                    return;
                }
                result = a / b;
            } else if (e.getSource() == b5) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                return;
            }

            t3.setText(String.valueOf(result));

        } catch (NumberFormatException ex) {
            t3.setText("Enter valid numbers");
        }
    }

    public static void main(String[] args) {
        Main c = new Main();

        c.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                c.dispose();
            }
        });
    }
}