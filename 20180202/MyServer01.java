import java.net.ServerSocket;
import java.io.IOException;

public class MyServer01{

	int portNum = 6000;

	public static void main(String[] args){

		ServerSocket serv = null;
		try{

			serv = new ServerSocket(this.portNum,30);

		}catch(IOException e){
			System.err.println("サーバエラー");
			System.exit(1);
		}
	}
}