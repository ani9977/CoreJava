package com.in.basics;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class DateAndTime {

public static void main(String[]args) throws ParseException {
	Date d= new Date ();
	
	SimpleDateFormat format= new
	SimpleDateFormat("dd/MM/yyyy");
	
	String str = format.format(d);
	System.out.println("Date :"+str);
	String str1 = "22/03/2009";
	Date d1 = format.parse(str1);{
	System.out.println(d1); 
	
	
	
	
}
}
}
