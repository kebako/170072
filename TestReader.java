import java.io.*;

public class TestReader{
	public static void main(String[] args){


		try{
			FileReader fr = new FileReader("data.txt");
			BufferedReader br = new BufferedReader(fr);

			String msg = br.readLine();
			//System.out.println("Hello");
			System.out.println(msg);
		}catch(IOException e){
			System.out.println("FAILED");
		}
	}
}