package swing_demo;

import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MultiplicationTwoNumber extends JFrame {
	
	public static void main(String[] args) {
		MultiplicationTwoNumber frame = new MultiplicationTwoNumber();
		frame.setVisible(true);
		frame.setBounds(500, 100, 250,250);;
	}
	
	public MultiplicationTwoNumber() {
		setLayout(new FlowLayout());
		JLabel firstLabel = new JLabel("Enter first number");
		JTextField firstTextField = new JTextField(20);
		firstTextField.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
		JLabel secondLabel = new JLabel("Enter second number");
		JTextField secondTextField = new JTextField(20);
		secondTextField.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
		JLabel result = new JLabel("Result :");
		JTextField  resultField = new JTextField(20);
		resultField.setEnabled(false);
		result.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
		
		
		JButton submitButton = new JButton("Calculate");
		add(firstLabel);
		add(firstTextField);
		add(secondLabel);
		add(secondTextField);
		add(result);
		add(resultField);
		add(submitButton);
		
		submitButton.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				double firstNum = Double.parseDouble(firstTextField.getText());
				double seconfNum = Double.parseDouble(secondTextField.getText());
				double calculatedResult = firstNum * seconfNum;
				resultField.setText(calculatedResult+ "");
			}
		});
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}
