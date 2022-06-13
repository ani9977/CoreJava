package com.collection;

public class Marksheet implements Comparable<Marksheet> {

	public String rollno;
	public String fname;
	public String lastname;
	public int marks;
	
	public Marksheet(String rollno, String fname, String lastname, int marks) {
		super();
		this.rollno = rollno;
		this.fname = fname;
		this.lastname=lastname;
		this.marks=marks;
	}
	
	public String getfname() {
		return this.fname;
	}
	
	@Override
	public int compareTo(Marksheet o) {
		return rollno.compareTo(o.rollno);
	}
	
	public String toString() {
		return rollno+" , "+ fname+ " , "+ lastname + " , "+marks;
	}
}
