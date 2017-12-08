import javax.swing.*;
import java.awt.*;

public class TestJPasswordField extends JFrame{

	TestJPasswordField(String title){
		setTitle(title);
		setSize(1000,1000);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pnl = new JPanel();

		JTextField jtf = new JTextField("",20);
		JPasswordField jpf = new JPasswordField("ALOHA");

		pnl.add(jtf,BorderLayout.NORTH);
		pnl.add(jpf,BorderLayout.NORTH);

		Container cp = getContentPane();
		cp.add(pnl,BorderLayout.NORTH);
	}
	public static void main(String[] args){
		TestJPasswordField tpf = new TestJPasswordField("HELLO");
		tpf.setVisible(true);
	}
}