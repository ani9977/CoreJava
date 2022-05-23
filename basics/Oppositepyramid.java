package com.in.basics;

public class Oppositepyramid {
           public static void main(String[] args) {
        	   int a=0;
			for (int i = 6; i >=1; --i, a=0 ){
				for (int j = 6; j>=1+i ; --j) {
					System.out.print(" ");
				}
				while(a!=2*i- 1){
					System.out.print("*");
					++a;
				}
				System.out.println();
				
			}
        	   
		}
}
