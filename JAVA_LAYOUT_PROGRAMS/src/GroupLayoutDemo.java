import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GroupLayoutDemo extends JFrame {
	
	public static void main(String[] args) {
		GroupLayoutDemo frame = new GroupLayoutDemo();
		frame.setVisible(true);
		
	}
	
	public GroupLayoutDemo() {
		JButton b1,b2,b3,b4;
		JPanel p;
		setSize(700,700);
		setTitle("Group Layout Demo");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p = new JPanel();
		GroupLayout l = new GroupLayout(p);
		p.setLayout(l);
		p.setBackground(Color.GREEN);
		add(p);
//		l.setAutoCreateGaps(true);
//		l.setAutoCreateContainerGaps(true);
		b1 = new JButton("Button 1");
		b2 = new JButton("Button 2");
		b3 = new JButton("Button 3");
		b4 = new JButton("Button 4");
		
		l.setHorizontalGroup(l.createSequentialGroup().addComponent(b1).
				addComponent(b2).addComponent(b3).addComponent(b4));
//		
		l.setVerticalGroup(l.createParallelGroup().addComponent(b1).addComponent(b2).
				addComponent(b3).addComponent(b4));
		
	}

}
