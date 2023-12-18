
import javax.swing.JApplet;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Nizam
 */
public class ScrollingText extends JApplet {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        JFrame frame = new JFrame("BEST PROGRAM IN THE WORLD!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.getContentPane().setBackground(new Color(200, 200, 200));
        frame.setLayout(new FlowLayout());

        JTextArea textArea = new JTextArea();
        textArea.setText(" BIGGEST UNIVERSITY OF BANGLADESH\n\n"
                + "International Islamic University Chittagong (IIUC)"
                + " is one of the top graded Government approved private universities in Bangladesh."
                + " The credit for the idea of establishing this University goes to "
                + " Islamic University Chittagong Trust (IUCT), which is the founder organization of the University."
                + " This Trust is a non-political and non-profit oriented voluntary organization, "
                + " registered with the Government of the People’s Republic of Bangladesh under the Societies "
                + " Act XXI of 1860. This Trust felt the need for a university under private initiative "
                + " in view of the absence of institutions of higher learning based on Islamic vision of life in the public sector."
        );
        textArea.setBounds(50, 50, 500, 300);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(new Color(200, 200, 200));
        textArea.setBorder(BorderFactory.createBevelBorder(1));
        textArea.setForeground(new Color(55, 55, 55));
        textArea.setFont(new Font("Comic Sans", Font.ITALIC, 15));
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(400, 200));
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        frame.add(scrollPane);
        frame.setVisible(true);

    }

}
