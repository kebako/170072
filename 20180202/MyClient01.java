import java.net.Socket;
import java.io.IOException;

public class MyClient01{

	//private String ipAddr = "172.16.21.54";
	//private int portNum = 6000;

	public static void main(String[] args){

		Socket sock = null;

		try{

			sock = new Socket("localhost",6000);

		}catch(IOException e){
			System.err.println("クライアントエラー");
			System.exit(1);
		}
	}
}
