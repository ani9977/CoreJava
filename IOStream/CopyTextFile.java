package IOStream;

import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextFile {
	public static void main(String[] args) throws IOException {
		String source = "C:\\Users\\Aniket Kumawat\\Downloads\\Linebyline.txt";
		String Target = "C:\\Users\\Aniket Kumawat\\Downloads\\blank.txt";
		FileReader reader = new FileReader(source);
		FileWriter writer = new FileWriter(Target);
		
		int ch = reader.read();
		while (ch!=-1) {
			writer.write(ch);
			ch = reader.read();
			
		}
		writer.close();
		reader.close();
		System.out.println(source+"is copied to"+Target);
	}

}
