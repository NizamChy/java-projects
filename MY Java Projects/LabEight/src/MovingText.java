
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import javax.swing.Timer;

public class MovingText extends JFrame implements ActionListener {

    JLabel label1;
    JLabel label2;

    public MovingText() {
        label1 = new JLabel(" Hello, welcome to IIUC. ");
        label1.setFont(new Font("Arial", 0, 50));
        add(label1, BorderLayout.NORTH);
        Timer t = new Timer(100, this);
        t.start();
    }

    public void actionPerformed(ActionEvent e) {
        String oldText = label1.getText();
        String newText = oldText.substring(1) + oldText.substring(0, 1);
        label1.setText(newText);
    }

    public static void main(String[] args) {
        MovingText frame = new MovingText();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(1000, 100);
        frame.setVisible(true);
    }
}
