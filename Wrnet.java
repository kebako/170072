import java.io.*;
  import java.net.*;
  
  public class Wrnet{
   public static void main(String[] args){
  //データ準備
   byte[] buff = new byte[1024];
     Socket wrsocket = null;
     InputStream instr = null;
       //OuputStream outstr = null;
  //さーばに接続
   try {
       wrsocket = new Socket(args[0],Integer.parseInt(args[1]));
         instr = wrsocket.getInputStream();
  // データを受信して標準出力に出力する
     int n = instr.read(buff);
       System.out.write(buff,0,n);
  //接続を切断する
     instr.close();
     } catch (Exception e) {
       System.err.println("networkerror");
       System.exit(1);
       }
  
   }
 }