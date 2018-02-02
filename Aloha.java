import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Aloha extends JFrame implements ActionListener{

	JButton jtn;

	public static void main(String[] args){

		Aloha alh = new Aloha("ALOHA");
		alh.setVisible(true);
		//System.out.println("Aloha");
	}

	Aloha(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		JPanel jpl = new JPanel();

		JButton jtn = new JButton("test");
		jtn.addActionListener(this);

		jpl.add(jtn);

		Container cp = getContentPane();
		cp.add(jpl,BorderLayout.NORTH);
	}

	public void actionPerformed(ActionEvent e){

			System.out.println("ALOHA");

	}
}