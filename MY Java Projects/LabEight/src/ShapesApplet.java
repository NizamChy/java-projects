
import java.awt.*;
import javax.swing.JApplet;

/**
 *
 * @author Nizam
 */
public class ShapesApplet extends JApplet {

    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawString("       Shapes in Applet Java", 50, 50);
        g.drawLine(20, 30, 20, 300);
        g.drawLine(20, 30,260,30);
        g.drawLine(20, 300, 260, 300);
        g.drawLine(260, 30, 260, 300);
        
        g.drawRect(70, 100, 30, 30);
        g.fillRect(170, 100, 30, 30);
        
        g.drawOval(70, 200, 30, 30);
        g.setColor(Color.green);
        g.fillOval(170, 200, 30, 30);
        /*         int x [ ] = {20, 50, 80 };
        int y [ ] = {80, 50, 80 };
        g.drawPolygon(x, y, 3); */
        
        int x [ ] = {100, 130, 160 };
        int y [ ] = {180, 130, 180 };
        g.setColor(Color.cyan);
        g.drawPolygon(x, y, 3);
        g.fillPolygon(x,y,3);
        
    }

    // TODO overwrite start(), stop() and destroy() methods
}
