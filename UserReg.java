import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;



public class UserReg extends JFrame{

	UserReg(String title){
		setTitle(title);
		setSize(1000,1000);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pnl = new JPanel();
		pnl.setLayout(new GridLayout(2,2));

		JLabel label1 = new JLabel("mail");
		JLabel label2 = new JLabel("password");
		JPasswordField jpf = new JPasswordField("",4);
		JTextField jtf = new JTextField("",20);
		

		pnl.add(label1);
		pnl.add(jtf);
		pnl.add(label2);
		pnl.add(jpf);

		Container cp = getContentPane();
		cp.add(pnl,BorderLayout.NORTH);

	}

	public static void main(String[] args){
		UserReg ur = new UserReg("Hello");
		ur.setVisible(true);
	}
}