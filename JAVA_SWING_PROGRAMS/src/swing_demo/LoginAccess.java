package swing_demo;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginAccess extends JFrame {

	public static void main(String[] args) {

		LoginAccess frame = new LoginAccess();
		frame.setVisible(true);
		frame.setTitle("Login Demo");
		frame.setBounds(500,200, 300,300);

	}

	public LoginAccess() {
		setLayout(new FlowLayout());

		JLabel usernameLabel = new JLabel("Username");
		JLabel passwordLable =new JLabel("Password");
		JTextField usernameField = new JTextField(20);
		JPasswordField passwordField = new JPasswordField(20);
		
		add(usernameLabel);
		add(usernameField);
		add(passwordLable);
		add(passwordField);
	

		JButton loginBtn = new JButton("Login");
		add(loginBtn);

		loginBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String username  = usernameField.getText();
				
				char [] password = passwordField.getPassword();
				char [] actualPAssword = {'a','d','m','i','n'};
//				System.out.println("Username : " + username);
//				System.out.println("Pass :" + String.valueOf(password));
//				System.out.println("act pass :" + String.valueOf(actualPAssword));
					
				if(username.equals("admin") && Arrays.equals(actualPAssword, password)) {
					JOptionPane.showMessageDialog( loginBtn,"Login Successful");
					System.out.println("Login Successful");
				}else {
					JOptionPane.showMessageDialog(loginBtn, "Login Failed");
					System.out.println("Login Failed");
				}
				
			}
		});

		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
