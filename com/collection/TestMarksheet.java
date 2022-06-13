package com.collection;
import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheet {
	
	public static void main(String[] args) {
		ArrayList marksheets= new ArrayList();
		
		marksheets.add(new Marksheet("A2","raju","yadav",81));
		marksheets.add(new Marksheet("A4","ashish","verma",79));
		marksheets.add(new Marksheet("A3","yuvraj","singh",68));
		marksheets.add(new Marksheet("A1","yuvraj","sharma",59));
	
			
	//sort by roll no.	
//	Collections.sort(marksheets);
//	for(Object o:marksheets) {
//		System.out.println(o);
//	}
	
	//sort elements by Name
//			OrderByfName cName = new OrderByfName();
//			Collections.sort(marksheets,cName);
			
	
		// sort name by Marks
		
//		OrderByMarks cMarks= new OrderByMarks();
//		Collections.sort(marksheets,cMarks);
//		for(Object o:marksheets) {
//			System.out.println(o);
//		}		
		
		//sort by condition
		OrderbyCondi cCondi= new OrderbyCondi();
		Collections.sort(marksheets, cCondi);
		for (Object o : marksheets) {
			System.out.println(o);
		}
	}
}
