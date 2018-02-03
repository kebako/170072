import java.net.*;
import java.io.*;


public class MyServer03{
	public static void main(String[] args){

		ServerSocket servSock = null;
		Socket clientSock = null;
		OutputStream os = null;
		InputStream in = null;
		InputStreamReader inr = null;
		BufferedReader br = null;

		try{
			servSock = new ServerSocket(5999, 30);
			while(true){
				clientSock = servSock.accept();
				System.out.println("接続を受付ました.");

				InetAddress iaClient = clientSock.getInetAddress();

				String ipClient = iaClient.toString();
				System.out.println("クライアントIP: "+ipClient);

				os = clientSock.getOutputStream();
				in = clientSock.getInputStream();
				inr = new InputStreamReader(in);
				br = new BufferedReader(inr);

				String clientData = br.readLine();
				System.out.println("クライアントから受信したデータ:" + clientData);

			}
			//clientSock.close();
		}catch(IOException e){
			System.err.println("サーバエラー");
			System.exit(1);
		}
	}
}
