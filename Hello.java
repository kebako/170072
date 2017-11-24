import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;

public class Hello extends JFrame{
	
	Hello(String title){

		setTitle(title);
		setSize(200,200);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn = new JButton("PUSH");

		JPanel panel = new JPanel();
		panel.add(btn);

		Container cp = getContentPane();
		cp.add(panel,BorderLayout.CENTER);
	}
	public static void main(String[] args){
	Hello hello = new Hello("HELLO");
	hello.setVisible(true);
	}
}