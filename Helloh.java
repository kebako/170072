import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.JCheckBox;
// import java.awt.GridLayout;
// import java.awt.event.ActionListener;
// import java.awt.event.ActionEvent;

public class Helloh extends JFrame {
	public static void main(String[] args){
		Helloh frame = new Helloh("Helloh");
		frame.setVisible(true);
	}

	Helloh(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel jpl = new JPanel();
	
		JButton btn = new JButton("GUNDAM");

		JLabel jll = new JLabel("ZAKUⅠ");

		JCheckBox check = new JCheckBox("ZAKUⅡ");

		jpl.add(btn);
		jpl.add(jll);
		jpl.add(check);

		Container cp = getContentPane();
		cp.add(jpl,BorderLayout.NORTH);
		

	}
}