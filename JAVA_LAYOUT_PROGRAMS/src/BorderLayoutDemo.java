
/*The class BorderLayout arranges the components to fit in the five regions: 
	east, west, north, south, and center. Each region can contain only one component
	and each component in each region is identified by the corresponding constant NORTH,
	SOUTH, EAST, WEST, and CENTER.*/

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame {

	public static void main(String[] args) {
		BorderLayoutDemo frame = new BorderLayoutDemo();
		frame.setVisible(true);
		frame.setTitle("Border Layout Demo");

	}

	public BorderLayoutDemo() {
		setLayout(new BorderLayout());
		JButton topButton = new JButton("PAGE_START/NORTH");
		JButton bottomButton = new JButton("PAGE_END/SOUTH");
		JButton leftButton = new JButton("LINE_START/EAST");
		JButton rightButton = new JButton("LINE_END/WEST");
		JButton centerButton = new JButton("CENTER");

//		add(topButton, BorderLayout.PAGE_START);
//		add(bottomButton, BorderLayout.PAGE_END);
//		add(leftButton, BorderLayout.LINE_START);
//		add(rightButton, BorderLayout.LINE_END);
//		add(centerButton, BorderLayout.CENTER);
		add(topButton, BorderLayout.NORTH);
		add(bottomButton, BorderLayout.SOUTH);
		add(leftButton, BorderLayout.EAST);
		add(rightButton, BorderLayout.WEST);
		add(centerButton, BorderLayout.CENTER);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
