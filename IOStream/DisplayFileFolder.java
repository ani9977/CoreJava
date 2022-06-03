package IOStream;

import java.io.File;

public class DisplayFileFolder {
	public static void main(String[] args) {
		File directory = new File("I:\\musics");
		String[] List = directory.list();
		for (int i = 0; i < List.length; i++) {
			System.out.println((i + 1) + " :  "+List[i]);
		}
	}

}
