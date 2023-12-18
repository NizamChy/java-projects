
import java.awt.*;
import javax.swing.JApplet;

/**
 *
 * @author Nizam
 */
public class AandB extends JApplet {
    
    public void paint(Graphics g)
    {
        g.drawLine( 70, 30,40, 90);
        g.drawLine( 70, 30,100, 90);        
        g.drawLine( 54, 60,84, 60);
        
        g.drawLine(120, 30, 120, 90);
        g.drawArc(97, 30, 47, 30, -90, 180);
        g.drawArc(97, 60, 47, 30, -90, 180);
    }

}
