import javax.swing.*;
import java.awt.*;


public class TestGui extends JFrame{
	
	TestGui(String title){
		setTitle(title);
		setLocation(0,0);
		setSize(1000,1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pnl = new JPanel();

		JTextField jtf = new JTextField("",20);
		JPasswordField jpf = new JPasswordField("ALOHA");

		pnl.add(jpf,BorderLayout.NORTH);
		pnl.add(jtf,BorderLayout.NORTH);

		Container cp = getContentPane();
		cp.add(pnl,BorderLayout.NORTH);
	}

	public static void main(String[] args){
		TestGui gui = new TestGui("TIRED.JAVA");
		gui.setVisible(true);
	}
}
