package com.in.basics;

import java.util.*;
public class Calendar_1 {
	public static void main(String[] args) {
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		
		System.out.println("Maintenance Dates every after 30 days for one year:");
		System.out.println();
		
		for (int i = 0; i <12; i++) {
			c.add(Calendar.DATE, 30);
			
			System.out.println(c.getTime());
		}
	}

}
