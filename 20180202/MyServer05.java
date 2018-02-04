import java.net.*;
import java.io.*;
import java.util.Date;


public class MyServer05{
   public static void main(String[] args){

      ServerSocket servSock = null;
      Socket clientSock = null;
      InputStream in = null;
      InputStreamReader inr = null;
      BufferedReader br = null;
      OutputStream out = null;
      OutputStreamWriter outW = null;
      PrintWriter pw = null;

      try{
         servSock = new ServerSocket(4000, 30);
         clientSock = servSock.accept();
         System.out.println("接続を受付ました.");
         InetAddress iaClient = clientSock.getInetAddress();
         String ipClient = iaClient.toString();
         System.out.println("クライアントIP: "+ipClient);
         in = clientSock.getInputStream();
         out = clientSock.getOutputStream();
         inr = new InputStreamReader(in);
         outW = new OutputStreamWriter(out);
         br = new BufferedReader(inr);
         pw = new PrintWriter(out);

         String clientData = br.readLine();
         System.out.println("クライアントから受信した学籍番号:" + clientData);
         Date now = new Date();

         String str = "170072";

         pw.println(now.toString());
         pw.println(str);
         pw.flush();
         clientSock.close();
      }catch(IOException e){
         System.err.println("サーバエラー");
         System.exit(1);
      }
   }
}