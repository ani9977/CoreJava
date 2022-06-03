package Serialization;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class PrimitiveFileRead {

	public static void main(String[] args) throws Exception {

		long dataPosition = 0;
		int data = 0;

		RandomAccessFile raf = new RandomAccessFile("C:\\Users\\Aniket Kumawat\\Downloads\\khali commonds.dat", "r");
		dataPosition = raf.readLong();

		System.out.println("dataPosition : " + dataPosition);

		raf.seek(dataPosition);
		data = raf.readInt();
		raf.close();

		System.out.println("The data is : " + data);
	}
}