import java.awt.*;
import javax.swing.*;

public class Exercise2 extends JFrame implements Runnable {
    private String text = "Java World";
    private int x = 400;
    private Thread thread;
    
    public Exercise2() {
        this.setTitle("Banner Application");
        setSize(800, 600);        
        thread = new Thread(this);
        thread.start();
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString(text, x, 300);
    }
    
    public void run() {
        while (true) {
            x = x - 2;
            if (x < -100) {
                x = 800;
            }
            repaint();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        Exercise2 app = new Exercise2();
        app.setVisible(true);
    }
}