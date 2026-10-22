import java.awt.*;

public class Main extends Applet implements Runnable {

    String str = "Welcome to Java";
    int x = 0;
    Thread t;

    public void init() {
        setBackground(Color.white);
        setForeground(Color.blue);
    }

    public void start() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            x = x + 10;

            if (x > getWidth())
                x = 0;

            repaint();

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public void paint(Graphics g) {
        g.drawString(str, x, 100);
    }
}