package IOStream;

import java.io.File;
import java.util.Date;

public class AttribJava {
	public static void main(String[] args) {
		File f = new File("I:\\musics\\guru randhawa");
		if(f.exists()) {
			System.out.println("name="+f.getName());
			System.out.println("Absolute="+f.getAbsolutePath());
			System.out.println("Is writable="+f.canWrite());
			System.out.println("Is readabe="+f.canRead());
			System.out.println("Is file="+f.isFile());
			System.out.println("Is Directory="+f.isDirectory());
			System.out.println("Last modified="+ new Date( f.lastModified()));
			System.out.println("Length="+f.length());
			
		}
	}

}
