package swing_demo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingCalc {
	public static void main(String[] args) {
		CalculationDemo calc = new CalculationDemo();

	}

}

class CalculationDemo extends JFrame {
	JLabel l;
	JTextField t1, t2;
	JButton btn1, btn2;

	public CalculationDemo() {
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		l = new JLabel("result");
		btn1 = new JButton("Add");
		btn2 = new JButton("Subtract");

		add(t1);
		add(t2);
		add(btn1);
		add(btn2);
		add(l);

		btn1.addActionListener((e) -> {
			int num1 = Integer.parseInt(t1.getText());
			int num2 = Integer.parseInt(t2.getText());
			int result = num1 + num2;
			l.setText(result + "");

		});

		btn2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(t1.getText());
				int num2 = Integer.parseInt(t2.getText());
				
				int result = num1-num2;
				l.setText(result+"");
			}
		});

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}