package Serialization;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ReadPrimitiveData {
	public static void main(String[] args) throws Exception {
		FileInputStream File = new FileInputStream("C:\\Users\\Aniket Kumawat\\Downloads\\khali commond.dat");
		DataInputStream in = new DataInputStream(File);

		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		System.out.println(in.readChar());
		System.out.println(in.readDouble());
		in.close();

	}

}
