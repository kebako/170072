import java.io.*;
import java.net.*;
	public class MyClient04{
	public static void main(String[] args) throws Exception{
		Socket writeSocket;
		OutputStream out;
		try{
			writeSocket = new Socket("172.16.21.56",4999);
			out = writeSocket.getOutputStream();
			PrintWriter pw = new PrintWriter(out);
			
			String[] str = {"170072","kebako","ケバブです。"};

			for (int i=0; i<str.length; i++) pw.println(str[i]);
			pw.flush();
		}catch(Exception e){
			System.err.println("ネットワークエラー");
			System.out.println(e);
			System.exit(1);
		}
	}
}
