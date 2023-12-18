
import java.awt.*;
import javax.swing.JApplet;

/**
 *
 * @author Nizam
 */
public class BangladeshiFlag extends JApplet {

    public void paint(Graphics g) {
        Color Color;
        //g.setColor(Color = new Color(0,153,0));
        g.setColor(Color = new Color(0,106,78));
        
        //g.setColor(Color = new Color(0,204,0));
        g.fillRect(90, 60, 200, 120);
        g.setColor(Color.red);
        g.fillOval(150, 86, 75, 70);

        g.setColor(Color.black);
        g.drawLine(90, 60, 90, 300);


    }

}
