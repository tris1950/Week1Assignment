
import hsa.Console;
import java.awt.Color;


public class BarChart2 {
    
    public static void main(String[] args) {
        int bar1, bar2;
        Console c = new Console();
        c.print("Enter height of bar1 >");
        bar1=c.readInt();
        c.print("Enter height of bar2 >");
        bar2=c.readInt();
        Bar b1 = new Bar();
        Bar b2 = new Bar();
        b1.xloc = 200;
        b1.height = bar1;
        b1.col=Color.red;
        
        b2.xloc = 300;
        b2.height = bar2;
        b2.col = Color.green;
        
        b1.draw(c);
        b2.draw(c);
    }
    
}