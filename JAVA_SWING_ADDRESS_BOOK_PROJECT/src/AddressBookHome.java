
import javax.swing.*;

public class AddressBookHome {
	public static void main(String[] args) {
		JFrame f = new JFrame("Button Example");
		JButton b = new JButton("Click Here");
		b.setBounds(100, 170, 120, 30);
		f.add(b);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
}