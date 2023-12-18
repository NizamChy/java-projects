
import java.awt.*;
import javax.swing.JApplet;

/**
 *
 * @author Nizam
 */
public class HelloJApplet extends JApplet {

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Hello world!", 140, 100);

    }
}
