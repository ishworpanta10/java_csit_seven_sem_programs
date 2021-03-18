package swing_demo;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuBarEg extends JFrame {

	JMenu menu, submenu;
	JMenuItem i1, i2, i3, i4, i5, i6;

	JMenuBarEg() {
		menu = new JMenu("Main Menu");
		submenu = new JMenu("Sub Menu");
		
		i1 =new  JMenuItem("Item 1");
		i2 =new  JMenuItem("Item 2");
		i3 =new  JMenuItem("Item 3");
		i4 =new  JMenuItem("Item 4");
		i5 =new  JMenuItem("Item 5");
		i6 = new  JMenuItem("Item 6");
		
	menu.add(i1);
	menu.add(i2);
	menu.add(i3);
	menu.add(i4);
	
	submenu.add(i5);
	submenu.add(i6);
	
	menu.add(submenu);
	
	JMenuBar bar = new JMenuBar();

	bar.add(menu);
	
	setJMenuBar(bar);
	
	setTitle("JMENU EXample");
	
//	add(bar);
	
	setVisible(true);
	
	setLayout(null);
	
	
	setBounds(400, 500, 300, 300);

	}

	public static void main(String[] args) {
		
		new JMenuBarEg();

	}

}
