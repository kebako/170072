import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

public class HelloMenu extends JFrame {

	HelloMenu(String title){
		setTitle(title);
		setSize(1000,1000);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar jmb = new JMenuBar();

		JMenu jm = new JMenu("File");

		JMenuItem mi1 = new JMenuItem("old");
		JMenuItem mi2 = new JMenuItem("new");

		setJMenuBar(jmb);
		jmb.add(jm);
		jm.add(mi1);
		jm.add(mi2);

	}

	public static void main(String[] args){
		HelloMenu hm = new HelloMenu("JEDI");
		hm.setVisible(true);
	}
}