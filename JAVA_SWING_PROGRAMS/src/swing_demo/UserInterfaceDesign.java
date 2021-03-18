
package swing_demo;

//UserInterfaceDesign.java
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class UserInterfaceDesign extends JFrame {
	JLabel user_id_label = new JLabel("User ID:");
	JTextField user_id_field = new JTextField(10);
	
	JLabel password_label = new JLabel("Password:");
	JPasswordField password_field = new JPasswordField(10);
	
	JLabel account_type_label = new JLabel("Account Type:");
	JRadioButton account_type_radio_button1 = new JRadioButton("Savings");
	JRadioButton account_type_radio_button2 = new JRadioButton("Current");
	
	ButtonGroup account_type_button_group = new ButtonGroup();
	
	
	JButton login_button = new JButton("LogIn");
	JButton cancel_button = new JButton("Cancel");
	JButton edit_button = new JButton("Edit");

	public UserInterfaceDesign() {
		account_type_button_group.add(account_type_radio_button1);
		account_type_button_group.add(account_type_radio_button2);
		
		JPanel p1 = new JPanel(new FlowLayout(10));
		
		p1.add(user_id_label);
		p1.add(user_id_field);
		p1.add(password_label);
		p1.add(password_field);
		p1.add(account_type_label);
		p1.add(account_type_radio_button1);
		p1.add(account_type_radio_button2);
		add(p1, BorderLayout.NORTH);
		
		
		JPanel p2 = new JPanel(new FlowLayout(50));
		p2.add(login_button);
		p2.add(cancel_button);
		p2.add(edit_button);
		add(p2, BorderLayout.SOUTH);
		
		
		login_button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", null);
					Statement s = c.createStatement();
					
					int id = Integer.parseInt(user_id_field.getText());
					char[] pass = password_field.getPassword();
					String passwd = String.valueOf(pass);
					System.out.println("ID:" + id + "\tPassword:" + passwd);
					String sql = "SELECT * FROM user_table WHERE user_id = " + id + " AND password='" + passwd + "'";
					
					ResultSet r = s.executeQuery(sql);
					
					if (r.first()) {
						JOptionPane.showMessageDialog(new JFrame(), "Log In Successful!!!");
					} else {
						JOptionPane.showMessageDialog(null, "Incorrect UserID/Password");
					}
				} catch (Exception ex) {
					System.out.println("Exception occurred");
				}
			}
		});
		cancel_button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		setSize(700, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new UserInterfaceDesign();
	}
}