//import java.io.FileWriter;
//import java.io.BufferedWriter;
//import java.io.IOException;
import java.io.*;

public class TestWriter{
	public static void main(String[] args){

		//File file = new File("data.txt");
		try{
			FileWriter fw = new FileWriter("data.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("アムロ、行きまーす！");
			bw.close();
		}catch(IOException e){
			System.out.println("親父にもぶたれたことないのにぃ！");
		}
	}
}