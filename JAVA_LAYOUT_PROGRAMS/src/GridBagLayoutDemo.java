import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridBagLayoutDemo extends JFrame {

	public static void main(String[] args) {
		GridBagLayoutDemo frame = new GridBagLayoutDemo();
		frame.setSize(200,200);
		frame.setVisible(true);

	}
	
	public GridBagLayoutDemo(){
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		
		JButton jButton1 = new JButton("Button1");
		add(jButton1, c);
		
		c.gridx = 0;
		c.gridy =1;
		JButton jButton2 = new JButton("Button2");
		add(jButton2,c);
		
		c.gridx = 1;
		c.gridy =0;
		JButton jButton3 = new JButton("Button3");
		add(jButton3, c);
		
		c.gridx  = 1;
		c.gridy = 1;
		JButton jButton4 = new JButton("Button4");
		add(jButton4,c);
		
		c.gridx  = 0;
		c.gridy = 2;
		JButton jButton5 = new JButton("Button5");
		c.fill = GridBagConstraints.BOTH;
		c.gridwidth = 2;
		add(jButton5,c);
		
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

//	public GridBagLayoutDemo() {
//		setLayout(new GridBagLayout());
//		GridBagConstraints s = new GridBagConstraints();
//
//		// for principle
//		s.gridx = 0;
//		s.gridy = 0;
//		JLabel plabel = new JLabel("Principle");
//		JTextField ptext = new JTextField(20);
//		add(plabel);
//		add(ptext);
//
//		// for time
//		s.gridx = 0;
//		s.gridy = 1;
//		JLabel tlabel = new JLabel("Time");
//		JTextField ttext = new JTextField(20);
//		add(tlabel, s);
//		s.gridx = 1;
//		add(ttext, s);
//
//		// for rate
//		s.gridx = 0;
//		s.gridy = 2;
//		JLabel rlabel = new JLabel("Rate");
//		JTextField rtext = new JTextField(20);
//		add(rlabel, s);
//		s.gridx = 1;
//		add(rtext, s);
//
//		// for interest displaying
//		s.gridx = 0;
//		s.gridy = 3;
//		JLabel ilabel = new JLabel("Interest");
//		JTextField itext = new JTextField(20);
//		itext.setEditable(false);
//		add(ilabel, s);
//		s.gridx = 1;
//		add(itext, s);
//
////		for buttom
//		s.gridx = 1;
//		s.gridy = 4;
//		s.gridwidth =1;
//		s.fill = GridBagConstraints.BOTH;
//		JButton calcBtn = new JButton("Calculate Interest");
//		add(calcBtn, s);	
//		
//
//		pack();
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//
//		
//		calcBtn.addActionListener(new ActionListener() {
//			@Override 
//			public void actionPerformed(ActionEvent e) {
//				try {
//					double p = Double.parseDouble(ptext.getText());
//					double t = Double.parseDouble(ttext.getText());
//					double r = Double.parseDouble(rtext.getText());
//					double result = (p*t*r)/100;
//					
//					itext.setText(String.valueOf(result));
//				}catch (Exception err) {
//					itext.setText(err.getMessage());
//				}
////				or
////				itext.setText(result+ "");
//			}
//		});
//		
//
//	}

}
