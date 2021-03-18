package swing_demo;
import javax.swing.*;

public class MyInternalFrame extends JFrame {
	public MyInternalFrame() {
		for (int i = 0; i < 5; i++) {
			JInternalFrame frame = new JInternalFrame("Internal Frame" + i);
			frame.setLocation(i * 50 + 10, i * 50 + 10);
			frame.setSize(200, 150);
			this.add(frame);
			frame.setVisible(true);
		}
		setVisible(true);
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyInternalFrame();
	}
}