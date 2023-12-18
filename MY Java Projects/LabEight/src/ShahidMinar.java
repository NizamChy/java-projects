
import javax.swing.*;
import java.awt.*;

class Minar extends JPanel {

    //Driver function
    public static void main(String args[]) {
        //Create a frame
        JFrame frame = new JFrame("Shahid Minar");
        frame.setSize(700, 700);
        frame.setBackground(Color.white);
        Minar panel = new Minar();
        frame.add(panel);
        //Set default close operation for the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    //function to draw the shapes
    public void paint(Graphics g) {
        g.drawLine(60, 300, 60, 400);
        g.drawLine(120, 300, 120, 400);
        g.drawLine(60, 300, 120, 300);
        //g.drawLine(X1, Y1, X2, Y2)

        g.drawLine(150, 250, 150, 400);
        g.drawLine(220, 250, 220, 400);
        g.drawLine(150, 250, 220, 250);

        g.drawLine(265, 210, 265, 400);
        g.drawLine(372, 210, 372, 400);
        g.drawLine(318, 210, 318, 400);
        g.drawLine(318, 210, 290, 120);
        
        g.drawLine(265, 210, 240, 120);
        g.drawLine(372, 210, 345, 120);
        g.drawLine(240, 120, 345, 120);

        g.drawLine(417, 250, 417, 400);
        g.drawLine(487, 250, 487, 400);
        g.drawLine(417, 250, 487, 250);

        g.drawLine(517, 300, 517, 400);
        g.drawLine(577, 300, 577, 400);
        g.drawLine(517, 300, 577, 300);
        

        g.drawLine(47, 400, 585, 400);
        g.drawLine(38, 407, 595, 407);
        g.drawLine(29, 414, 605, 414);
        g.drawLine(47, 400, 29, 414);
        g.drawLine(585, 400, 605, 414);

        g.setColor(Color.red);
        g.fillOval(255, 230, 125, 120);


    }
}
