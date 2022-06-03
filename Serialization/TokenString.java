package Serialization;

import java.util.StringTokenizer;

public class TokenString {

	public static void main(String[] args) {
	
	String str = "This is Java,Java is Object Oriented Language,Java is guarantee for job";
	StringTokenizer stn = new StringTokenizer(str,",");
	String token = null;
	
	while (stn.hasMoreElements()){
		token = stn.nextToken();
		
		System.out.println("Token is :" + token);
	}
	}
}