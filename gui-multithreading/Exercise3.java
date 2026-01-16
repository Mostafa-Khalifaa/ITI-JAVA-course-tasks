import java.awt.*;
import javax.swing.*;

public class Exercise3 extends JFrame implements Runnable {
    private int x = 100;
    private int y = 100;
    
    private int dx = 2;
    private int dy = 2;
    
    private int ballSize = 30;
    
    private Thread thread;
    
    public Exercise3() {     
        this.setTitle("Moving Ball Application");   
        setSize(400, 400);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        thread = new Thread(this);
        thread.start();
    }
    
      public void paint(Graphics g) {
        
        super.paint(g);
        
        g.setColor(Color.BLACK);
        g.fillOval(x, y, ballSize, ballSize);
    }
    
    public void run() {
        while (true) {
            x = x + dx;
            y = y + dy;
            
            int windowWidth = getWidth();
            int windowHeight = getHeight();
            
            // Check if ball hits left or right wall
            if (x < 0 || x > windowWidth - ballSize) {
                dx = -dx;  
            }
            
            // Check if ball hits top or bottom wall
            if (y < 0 || y > windowHeight - ballSize) {
                dy = -dy;  
            }
            
            repaint();
            
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        Exercise3 app = new Exercise3();
        app.setVisible(true);
    }
}