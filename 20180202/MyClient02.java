import java.io.*;
import java.net.*;
   
   public class MyClient02{
   public static void main(String[] args) throws Exception{
      
      byte[] buff = new byte[1024];
      Socket writeSocket;
      InputStream in;
      InputStreamReader inr;
      BufferedReader br;
      OutputStream out;
      PrintWriter pw = null;
      boolean cont = true;
   
      try{
        writeSocket = new Socket(172.16.21.56,4999);
        while(cont){
          in = writeSocket.getInputStream();
          out = writeSocket.getOutputStream();
        
          InputStreamReader inr = new InputStreamReader(in);
          BufferedReader br = new BufferedReader(inr);
   
          String msg = new java.util.Scanner(System.in).nextLine();
          if(msg.equals("end")){
            
           cont = false;
          }else{
            
          PrintWriter pw = new PrintWriter(out);
   
          pw.println(msg);
          pw.flush();
        }
      }catch(Exception e){
        System.err.println("ネットワークエラー");
        System.out.println(e);
        System.exit(1);
      }
    }
   }