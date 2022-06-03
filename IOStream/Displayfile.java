package IOStream;

import java.io.File;

public class Displayfile {
	public static void main(String[] args) {
		File directory = new File ("C:\\Users\\Aniket Kumawat\\Downloads");
		File []List = directory.listFiles();
		for (int i = 0; i < List.length; i++) {
		if (List[i].isFile()) {	
			System.out.println((i+1)+" :  "+List[i].getName());
		}
	}

}
}