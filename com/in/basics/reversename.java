package com.in.basics;

public class reversename {

	public static void main(String[] args) {

		String a = "aniket kumawat";

		String[] b = a.split(" ");
		for (String s : b) {
			for (int i = s.length(); i >= 1; i--) {
				System.out.print(s.charAt(i - 1));
			}
			System.out.print("\t");
		}

	}
}