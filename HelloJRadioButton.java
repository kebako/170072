import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloJRadioButton extends JFrame implements ActionListener{

	JRadioButton rbtn1;
	JRadioButton rbtn2;
	JRadioButton rbtn3;
	JLabel label;
	JButton btn;

	HelloJRadioButton(String title){
		setTitle(title);
		setSize(1000,1000);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.rbtn1 = new JRadioButton("X wing");
		this.rbtn2 = new JRadioButton("Y wing");
		this.rbtn3 = new JRadioButton("A wing");

	    this.btn = new JButton("solo");
		btn.addActionListener(this);

		this.label = new JLabel("rook");

		ButtonGroup btng = new ButtonGroup();
		btng.add(this.rbtn1);
		btng.add(this.rbtn2);
		btng.add(this.rbtn3);

		JPanel pnl = new JPanel();
		pnl.setLayout(new GridLayout(5,1));
		pnl.add(this.rbtn1);
		pnl.add(this.rbtn2);
		pnl.add(this.rbtn3);
		pnl.add(this.btn);
		pnl.add(this.label);

		Container cp = getContentPane();
		cp.add(pnl,BorderLayout.NORTH);
	}

	public void actionPerformed(ActionEvent e){
		System.out.println("CLICK NOW");

		Boolean ans1 = this.rbtn1.isSelected();
		Boolean ans2 = this.rbtn2.isSelected();
		Boolean ans3 = this.rbtn3.isSelected();

		String msg ="";
		if(ans1){
			msg = this.rbtn1.getText()+"が選択されてるお";
			this.label.setText(msg);
		}else if(ans2){
			msg = this.rbtn2.getText()+"が選択されてるお";
			this.label.setText(msg);
		}else if(ans3){
			msg = this.rbtn3.getText()+"が選択されてるお";
			this.label.setText(msg);
		}
	}

	public static void main(String[] args){
		HelloJRadioButton hjrb = new HelloJRadioButton("STAR WARS");
		hjrb.setVisible(true);
	}
}