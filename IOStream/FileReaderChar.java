package IOStream;

import java.io.FileReader;

public class FileReaderChar {
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("C:\\Users\\Aniket Kumawat\\Downloads\\ak.txt");
		int ch = reader.read();
		char chr;

		while (ch != -1) {
			chr = (char) ch;
			System.out.print(chr);
			ch = reader.read();

		}
	}

}
