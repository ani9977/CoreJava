package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestEmployee {
	public static void main(String[] args) throws IOException {
		FileOutputStream file =  new FileOutputStream("C:\\Users\\Aniket Kumawat\\Downloads\\khali commond.ser");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Employee emp = new Employee(69,"henry","Fayol");
		out.writeObject(emp);
		out.close();
		System.out.println("object is succesfully printed");
		
	}

}
