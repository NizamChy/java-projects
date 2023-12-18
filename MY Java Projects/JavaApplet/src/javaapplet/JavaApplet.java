
package javaapplet;

import java.applet.*;
import java.awt.*;

/**
 *
 * @author Nizam
 */
public class JavaApplet extends Applet{
      public void paint(Graphics g){
          g.drawString("Hi Nizam!", 100, 100);
          g.drawLine(500, 200, 300, 200);
      }
    
}
