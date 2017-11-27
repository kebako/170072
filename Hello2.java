import javax.swing.JFrame;

public class Hello2 extends JFrame{

	Hello2(String title){

		setTitle(title);
		setSize(200,200);
		setLocation(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args){
		Hello hello = new Hello("ALOHA");
		hello.setVisible(true);
	}
}