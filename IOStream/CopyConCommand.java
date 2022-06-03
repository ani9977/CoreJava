package IOStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CopyConCommand {
	public static void main(String[] args) throws Exception {
		
		String Target = "C:\\Users\\Aniket Kumawat\\Downloads";
		FileWriter writer = new FileWriter(new File("target"));
		PrintWriter printWriter = new PrintWriter(writer);
		InputStreamReader isReader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isReader);
		
		String line = in.readLine();
		while (!line.equals("quit")) {
			printWriter.print(line);
			line = in.readLine();
			}
             printWriter.close();
             isReader.close();

	}

}
