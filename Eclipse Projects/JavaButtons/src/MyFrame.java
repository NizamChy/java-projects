import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	JLabel label;
	
	MyFrame(){
		
		ImageIcon icon = new ImageIcon("njpanel.png");
		ImageIcon icon2 = new ImageIcon("Shati1.png");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150, 250, 150, 150);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(120, 150, 250, 100);
		button.addActionListener(this);
		//same of up button.addActionListener(e -> System.out.println("Nizam"));
		button.setText("I'm a button!");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sas",Font.BOLD,25));
		// button.setIconTextGap(-15);
		button.setForeground(Color.DARK_GRAY);
		button.setBackground(Color.WHITE);
		//button.setBorder(BorderFactory.createEtchedBorder());
		button.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		//button.setEnabled(false); //To disable button
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			//System.out.println("Nizam");
			label.setVisible(true);
		}
		
	}

}
