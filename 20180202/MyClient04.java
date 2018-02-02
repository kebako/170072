import java.io.*;
   import java.net.*;
   
   public class MyClient04{
    public static void main(String[] args) throws Exception{
      
      byte[] buff = new byte[1024];
      Socket writeSocket;
      InputStream in;
      InputStreamReader inr;
      BufferedReader br;
      OutputStream out;
      PrintWriter pw;
      boolean cont = true;
   
      try{
        writeSocket = new Socket(args[0],Integer.parseInt(args[1]));
        while(cont){
          in = writeSocket.getInputStream();
          out = writeSocket.getOutputStream();
        
          InputStreamReader inr = new InputStreamReader(in);
          BufferedReader br = new BufferedReader(inr);
   
          String msg = new java.util.Scanner(System.in).nextLine();
          if(msg.equals("end")){
            cont = false;
            System.out.println("終了します");
          }else{
            System.out.println(msg+"を送信しました。終わる場合は、｢end｣と打ってください。");
          }
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