package swing_demo;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class ButtonExample {
	public static void main(String[] args) {
		JFrame f = new JFrame("Button Example");
		 JTextField tf = new JTextField();
		tf.setBounds(150, 50, 150, 20);
		JButton b = new JButton("Click Here");
		b.setBounds(160, 80, 120, 20);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Welcome to Javatpoint.");
			}
		});
		f.add(b);
		f.add(tf);
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
	}
}