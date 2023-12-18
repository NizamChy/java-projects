/* Bismillahir Rahmanir Rahim */
import java.awt.*;
import javax.swing.*;

class SritiShoudho extends JPanel {

    public static void main(String[] args) {
        //create a frame
        JFrame frame = new JFrame("Sriti Shoudho");
        frame.setSize(800, 700);
        frame.setBackground(Color.WHITE);
        SritiShoudho panel = new SritiShoudho();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawLine(203, 414, 567, 414);
        g.drawLine(200, 418, 570, 418);
        g.drawLine(385, 195, 385, 414);
        g.drawLine(385, 195, 365, 414);
        g.drawLine(385, 195, 405, 414);
        
        g.drawLine(382, 230, 345, 414);
        g.drawLine(389, 230, 425, 414);
        
        g.drawLine(375, 265, 325, 414);
        g.drawLine(395, 265, 445, 414);
        
        g.drawLine(349, 340, 305, 414);
        g.drawLine(421, 340, 465, 414);
        
        g.drawLine(338, 357, 285, 414);
        g.drawLine(432, 357, 483, 414);
        
       // g.drawLine(365, 414, 385, 370);
        //g.drawLine(385, 370, 405, 414);
        
       //g.drawLine(405, 414, 385, 300);
    }

}
