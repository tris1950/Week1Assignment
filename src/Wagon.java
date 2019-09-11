
import hsa.Console;
import java.awt.Color;


public class Wagon {

    public static void main(String[] args) {
        Console c = new Console();
        
        c.setColor(Color.cyan);
        c.fillRect(0,0,800,600);
        
        c.setColor(Color.green);
        c.fillRect(0,400,800,200);
        
        c.setColor(Color.red);
        c.fillRect(175,300,300,75);
        
        c.setColor(Color.black);
        c.fillOval(175, 365, 50, 50);
        
        c.fillOval(425, 365, 50, 50);
        
        c.drawLine(175, 300, 100, 200);
        
        c.setColor(Color.yellow);
        c.fillOval(500, 10, 100, 100);
    }
    
}
