import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloJCheckBox extends JFrame implements ActionListener{

	JLabel label;
	JLabel label2;
	JLabel label3;
	JCheckBox cb1;
	JCheckBox cb2;
	JCheckBox cb3;

	HelloJCheckBox(String title){
		setTitle(title);
		setSize(1000,1000);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pnl = new JPanel();
		pnl.setLayout(new GridLayout(3,1));

 		this.cb1 = new JCheckBox("kebab");
		this.cb2 = new JCheckBox("kebab22");
		this.cb3 = new JCheckBox("kebab33");

		this.label = new JLabel();
		this.label2 = new JLabel();
		this.label3 = new JLabel();
		
		JButton btn1 = new JButton("毛羽子");
		btn1.addActionListener(this);


		pnl.add(this.cb1);
		pnl.add(this.cb2);
		pnl.add(this.cb3);
		pnl.add(btn1);
		pnl.add(label);
		pnl.add(label2);
		pnl.add(label3);


		Container cp = getContentPane();
		cp.add(pnl,BorderLayout.NORTH);
	}

	public void actionPerformed(ActionEvent e){
		System.out.println("click");

		if(this.cb1.isSelected()){
			this.label.setText("click now");
		}else if(this.cb2.isSelected()){
			this.label2.setText("click now2");
		}else{
			this.label3.setText("click now3");
		}
	}

	public static void main(String[] args){
		HelloJCheckBox frame = new HelloJCheckBox("Strong KEBAB!");
		frame.setVisible(true);
	}
}
