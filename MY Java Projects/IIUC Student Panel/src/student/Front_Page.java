/* Bismillahir Rahmanir Rahim */
package student;

/**
 *
 * @author Nizam
 */
import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;

class Front_Page implements ActionListener {

    JFrame f;
    JLabel id, l1;
    JButton b;

    Front_Page() {

        f = new JFrame("International Islamic University Chittagong");
        f.setBackground(Color.red);
        f.setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("student/icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);

        l1.setBounds(0, 150, 1360, 530);
        f.add(l1);

        b = new JButton("CLICK HERE TO CONTINUE");
        b.setBackground(Color.CYAN);
        b.setForeground(Color.black);

        b.setBounds(500, 600, 300, 70);
        b.addActionListener(this);

        id = new JLabel();
        id.setBounds(0, 0, 1360, 750);
        id.setLayout(null);

        JLabel lid = new JLabel("               IIUC STUDENT PANEL");
        lid.setBounds(80, 30, 1500, 100);
        lid.setFont(new Font("serif", Font.PLAIN, 70));
       // lid.setForeground(Color.getHSBColor(56, 87, 730));
        lid.setForeground(Color.getHSBColor(255,204,0));
        id.add(lid);

        id.add(b);
        f.add(id);

        f.getContentPane().setBackground(Color.CYAN);

        f.setVisible(true);
        f.setSize(1360, 750);
        f.setLocation(300, 120);

        while (true) {
            lid.setVisible(false); // lid =  j label
            try {
                Thread.sleep(500); //1000 = 1 second
            } catch (Exception e) {
            }
            lid.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b) {
            f.setVisible(false);
            new login();
        }
    }

    public static void main(String[] arg) {
        Front_Page f = new Front_Page();
    }
}
