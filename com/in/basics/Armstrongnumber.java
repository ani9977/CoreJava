package com.in.basics;

public class Armstrongnumber {
	
	public static void main(String[] args) {
		
		int i = 153;
		int r;
		int s=0;
		int temp;
		
		temp=i;
		while(i>0) {
			r=i%10;
			s=(r*r*r)+s;
		    i=i/10;
			}
		
		//System.out.println((temp==s)?(s+" is armstrong number"):i);
		if (temp==s) {
		System.out.println("is armstrong number= "+s);
	}
else {
		System.out.println("is not armstrong number= "+s);

		}
	}
}
