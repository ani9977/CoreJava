package IOStream;

import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteToFile {
	public static void main(String[] args)throws Exception {
		FileWriter writer = new FileWriter("C:\\Users\\Aniket Kumawat\\Downloads\\Linebyline.txt",true);
		PrintWriter pw = new PrintWriter(writer);
		for (int i = 0; i <8; i++) {
			pw.println(i+":bhole  ");
			
			
		}
		pw.close();
		writer.close();
		System.out.println("file is succesfully written, Pl check C:\\\\Users\\\\Aniket Kumawat\\\\Downloads\\\\Linebyline.txt ");
	}

}
