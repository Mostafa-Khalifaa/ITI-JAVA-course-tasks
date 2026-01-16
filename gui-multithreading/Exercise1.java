import java.awt.*;
import java.util.Date;
import javax.swing.*;

public class Exercise1 extends JFrame implements Runnable {
    
    Thread th;
    
    Date d = new Date();
    
    JLabel timeLabel = new JLabel();
    
    public Exercise1() {
        this.setTitle("Date & Time Frame Application");
        
        timeLabel.setHorizontalAlignment(JLabel.CENTER);
        
        timeLabel.setText(d.toString());
        
        this.add(timeLabel, BorderLayout.CENTER);
        
        th = new Thread(this);
        
        th.start();
    }
    
    public static void main(String[] args) {
        Exercise1 app = new Exercise1();
        
        app.setBounds(50, 50, 600, 400);
        
        app.setVisible(true);
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void run() {
        while (true) {
            d = new Date();
            
            timeLabel.setText(d.toString());
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    } 
}