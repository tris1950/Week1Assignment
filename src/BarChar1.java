
import hsa.Console;
import java.awt.Color;


public class BarChar1 {
    
    public static void main(String[] args) {
        int bar1, bar2;
        Console c = new Console();
        c.print("Enter height of bar1 >");
        bar1=c.readInt();
        c.print("Enter height of bar2 >");
        bar2=c.readInt();
        
        c.setColor(Color.red);
        c.fillRect(200,500-bar1,50,bar1);
        c.drawString("Value: "+bar1,200,500-bar1);
        
        c.setColor(Color.green);
        c.fillRect(300,500-bar2,50,bar2);
        c.drawString("Value: "+bar2,300,500-bar2);
    }
    
}