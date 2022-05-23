package com.in.basics;

public class Swippingvariable {

     public static void main(String[] args) {
	
    	 int a=10;
    	 int b=20;
    	 int c=a; 
    	  a= a+b;
    	 b= a-b;
    	 a= a-b;
    	 
    	  
    	System.out.println("a="+a);
    	 System.out.println("b="+b);
    	a=b;
    	b=c;
    	c=a;
    	System.out.println("a="+a);
    	System.out.println("b="+b);
    	
    	
    	 
	}


}
        