import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fukushu extends JFrame implements ActionListener{

	JCheckBox jcb;
	JButton jbt;
	JLabel jll;

	Fukushu(String title){
		setTitle(title);
		setSize(1000,1000);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pnl = new JPanel();
		pnl.setLayout(new GridLayout(3,1));

		this.jcb = new JCheckBox("KEBAKO");

		JButton jbt = new JButton("ケバニキ");
		jbt.addActionListener(this);

		this.jll = new JLabel("賢");

		pnl.add(this.jcb);
		pnl.add(jbt);
		pnl.add(this.jll);

		Container cp = getContentPane();
		cp.add(pnl,BorderLayout.NORTH);
	}

	public void actionPerformed(ActionEvent e){
		System.out.println("click");
		if(this.jcb.isSelected()){
			this.jll.setText("Now Click KEBAB!");
		}else{
			this.jll.setText("No Click KEBAB!");
		}

	}

	public static void main(String[] args){
		Fukushu fks = new Fukushu("kebakeba");
		fks.setVisible(true);
	}
}