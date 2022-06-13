
package com.in.basics;
public class Calculatemethod {

	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
	Add(a,b);
	Subtract(a,b);
	 Divide(a,b);
	Multiplication(a,b);
	}
	public static void Add (int a, int b) {
		int c= a+b;
		System.out.println(c);
	 	
	}
	public static void Subtract(int a, int b){
		int c= a-b;
		System.out.println(c);
		
	
	}
	public static void Divide (int a, int b) {
		int c= a/b;
		System.out.println(c);
	}
	public static void Multiplication(int a, int b) {
		int c= a*b;
		System.out.println(c);
	}
}
