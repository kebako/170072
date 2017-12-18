import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fukushu extends JFrame implements ActionListener{

	JCheckBox jcb1;
	JCheckBox jcb2;
	JCheckBox jcb3;
	JButton btn;
	JLabel lbl;
	JRadioButton jrb1;
	JRadioButton jrb2;
	JRadioButton jrb3;

	Fukushu(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pnl = new JPanel();
		pnl.setLayout(new GridLayout(5,1));

		this.btn = new JButton("Click Now!");
		btn.addActionListener(this);

		this.lbl = new JLabel();

		this.jcb1 = new JCheckBox("アムロ");
		this.jcb2 = new JCheckBox("カミーユ");
		this.jcb3 = new JCheckBox("ジュドー");

		//this.jrb = new JRadioButton[2];
		this.jrb1 = new JRadioButton("ガンダム");
		this.jrb2 = new JRadioButton("Zガンダム");
		this.jrb3 = new JRadioButton("ZZガンダム");

		// ButtonGroup radioGroup = new ButtonGroup();
		// radioGroup.add(jrb[0]);
		// radioGroup.add(jrb[1]);
		// radioGroup.add(jrb[2]);

		JMenuBar jmb = new JMenuBar();

		//メニューobjを作る
		JMenu fm = new JMenu("kebab");
		JMenu fm2 = new JMenu("kebab22");
		JMenu fm3 = new JMenu("kebab33");

		//メニューアイテムobjをつくる
		JMenuItem jmi = new JMenuItem("新規作成");
		JMenuItem jmi2 = new JMenuItem("新規作成22");
		JMenuItem jmi3 = new JMenuItem("新規作成33");

		pnl.add(this.jcb1);
		pnl.add(this.jcb2);
		pnl.add(this.jcb3);
		pnl.add(this.jrb1);
		pnl.add(this.jrb2);
		pnl.add(this.jrb3);
		pnl.add(this.btn);
		pnl.add(this.lbl);
		//メニューにメニューアイテムを追加する
		fm.add(jmi);
		fm2.add(jmi2);
		fm3.add(jmi3);
		//ウィンドウにメニューバーを　set　する	
		setJMenuBar(jmb);
		//メニューバーにメニューを追加する
		jmb.add(fm);
		jmb.add(fm2);
		jmb.add(fm3);


		Container cp = getContentPane();
		cp.add(pnl,BorderLayout.NORTH);
	}

	public void actionPerformed(ActionEvent e){
		Boolean ans1 = this.jcb1.isSelected();
		Boolean ans2 = this.jcb2.isSelected();
		Boolean ans3 = this.jcb3.isSelected();

		String msg ="";
		if(ans1){
			msg = this.jcb1.getText();
			this.lbl.setText(msg);
		}else if(ans2){
			msg = this.jcb2.getText();
			this.lbl.setText(msg);
		}else if(ans3){
			msg = this.jcb3.getText();
			this.lbl.setText(msg);
		}else{
			System.out.println("click");
		}
	}

	public static void main(String[] args){
		Fukushu fks = new Fukushu("MOBILE SUITS GUNDAM");
		fks.setVisible(true);
	}
}