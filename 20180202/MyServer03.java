import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class MyServer03{
	public static void main(String[] args){

		ServerSocket servSock = null;
		Socket clientSock = null;
		OutputStream os = null;
		PrintWriter pw = null;

		try{
			servSock = new ServerSocket(5999, 30);
			while(true){
				clientSock = servSock.accept();
				System.out.println("接続を受付ました.");

				InetAddress iaClient = clientSock.getInetAddress();

				String ipClient = iaClient.toString();
				System.out.println("クライアントIP: "+ipClient);

				os = clientSock.getOutputStream();
				pw = new PrintWriter(os);

				pw.println("ALOHA!");
				pw.flush();
			}
		}catch(IOException e){
			System.err.println("サーバエラー");
			System.exit(1);
		}
	}
}