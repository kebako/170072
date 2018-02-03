import java.io.*;
import java.net.*;

public class MyClient02{
  public static void main(String[] args) {
    byte[] buff = new byte[1024];
    Socket wrsocket = null;
    InputStream instr = null;
    OutputStream outstr = null;
    String msg;
    boolean cont = true;
    int i;

    try{
      wrsocket = new Socket(args[0],5999);
      instr = wrsocket.getInputStream();

      msg = "ALOHA!!!!!";

      outstr = wrsocket.getOutputStream();
      outstr.write('\n');

      int n = instr.read(buff);
      System.out.write(buff, 0, n);

      wrsocket.close();
      }catch (Exception e){
      System.err.println("ネットワークエラー");
      System.exit(1);
      cont = false;
    }
  }
}
