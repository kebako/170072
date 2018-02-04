import java.net.*;
import java.io.*;


public class MyServer03{
	public static void main(String[] args){

		ServerSocket servSock = null;
		Socket clientSock = null;
		InputStream in = null;
		InputStreamReader inr = null;
		BufferedReader br = null;

		try{
			servSock = new ServerSocket(5999, 30);
			clientSock = servSock.accept();
			in = clientSock.getInputStream();
			inr = new InputStreamReader(in);
			br = new BufferedReader(inr);
			String clientData = br.readLine();
			System.out.println("クライアントから受信したデータ:" + clientData);
			clientSock.close();
		}catch(IOException e){
			System.err.println("サーバエラー");
			System.exit(1);
		}
	}
}
