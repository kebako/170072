import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestScanner{
	public static void main(String[] args){
		try{
			FileWriter fw = new FileWriter("data.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);

			String userData = "";
			while(true){
				System.out.println("input msg>");
				userData = new java.util.Scanner(System.in).nextLine();

				if(userData.equals("exit")) break;
				bw.write(userData+"\n");
			}
			bw.close();
		}catch(IOException e){
			System.out.println("カイ・シデン");
		}
	}
}