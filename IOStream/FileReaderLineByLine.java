package IOStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;

public class FileReaderLineByLine {
public static void main(String[] args)throws Exception {
	FileReader reader = new FileReader("C:\\Users\\Aniket Kumawat\\Downloads\\Linebyline.txt");
	BufferedReader br  = new BufferedReader(reader);
	
	String line = br.readLine();
	while (line!=null){
		System.out.println(line);
		line = br.readLine();
		
	}
	reader.close();
	
}
}
