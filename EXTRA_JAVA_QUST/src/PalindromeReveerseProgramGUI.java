import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class PalindromeReveerseProgramGUI extends JFrame {

	public PalindromeReveerseProgramGUI() {

		JLabel inputLabel, answerLabel;
		JTextField inputField, outputField;
		JButton reverseButton, palindromeButton, vowelButton;

		inputLabel = new JLabel("Input any String :");
		answerLabel = new JLabel("Output :");

		inputField = new JTextField(20);
		outputField = new JTextField(20);
		outputField.setEditable(false);

		palindromeButton = new JButton("CheckPalindrome");
		reverseButton = new JButton("Reverse");
		vowelButton = new JButton("Fins Vowels");

		setLayout(new FlowLayout());
		add(inputLabel);
		add(inputField);
		add(answerLabel);
		add(outputField);
		add(palindromeButton);
		add(reverseButton);
		add(vowelButton);
		
		pack();

		reverseButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String reverseString = "";
				String userInput = inputField.getText();
				int length = userInput.length();

				for (int i = length - 1; i >= 0; i--) {
					reverseString = reverseString + userInput.charAt(i);
				}

				outputField.setText(reverseString);

			}
		});

		palindromeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String reverseString = "";
				String userInput = inputField.getText();
				int length = userInput.length();
				for (int i = length - 1; i >= 0; i--) {
					reverseString += userInput.charAt(i);
				}

				if (reverseString.equalsIgnoreCase(userInput)) {
					outputField.setText("String is Palindrome");
				} else {
					outputField.setText("String is not palindrome");
				}

			}
		});

		vowelButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
				String userInput = inputField.getText();
				int length = userInput.length();
				char[] extractedVowels = new char[length];
				String vowelsLetters = "";

				for (int i = 0; i < length ; i++) {
					for (int j = 0; j < vowels.length; j++) {
						if (userInput.charAt(i) == vowels[j]) {
							extractedVowels[i] = userInput.charAt(i);
							vowelsLetters = vowelsLetters + String.valueOf(extractedVowels[i]);
						}
					}
				}
				outputField.setText("Vowels :" + vowelsLetters);

			}
		});
	}

	public static void main(String[] args) {
		PalindromeReveerseProgramGUI obj = new PalindromeReveerseProgramGUI();
		obj.setVisible(true);
//		obj.setLocationRelativeTo(null);
		obj.setSize(250, 250);
	}

}
