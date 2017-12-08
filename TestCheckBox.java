import javax.swing.*;
import java.awt.*;

public class TestCheckBox extends JFrame {

	TestCheckBox(String title){
		setTitle(title);
		setSize(1000,1000);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pnl = new JPanel();

		JCheckBox jcb1 = new JCheckBox("ラーメン");
		JCheckBox jcb2 = new JCheckBox("ねぎ");
		JCheckBox jcb3 = new JCheckBox("豚骨醤油");

		pnl.add(jcb1);
		pnl.add(jcb2);
		pnl.add(jcb3);

		Container cp = getContentPane();
		cp.add(pnl,BorderLayout.NORTH);
	}

	public static void main(String[] args){
		TestCheckBox jcb4 = new TestCheckBox("ねぎラーメン最強");
		jcb4.setVisible(true);
	}
}
