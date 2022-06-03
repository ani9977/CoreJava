package IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBinaryFile {
	public static void main(String[] args) throws IOException {
		String Source = "I:\\_P011187.JPG";
		String target = "C:\\Users\\Aniket Kumawat\\Downloads\\peakpx (3).JPG";
		FileInputStream reader = new FileInputStream(Source);  
		FileOutputStream writer = new FileOutputStream(target);
		
		int ch = reader.read();
		while(ch!=-1) {
			writer.write(ch);
			ch = reader.read();
			
		}
		writer.close();
		reader.close();
		System.out.println(Source+"is copied to"+target);
				
	}

}
