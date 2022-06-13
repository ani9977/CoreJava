package CollectionsFramework;

public class ProgramMarksheet implements Comparable<ProgramMarksheet> {
	private String Rollno;
	private String fname;
	private String lname;
	private int Physiscs;
	private int Chemistry;
	private int Maths;


	public ProgramMarksheet(String rollno, String fname,String lname, int physiscs, int chemistry, int maths) {
		
	this.	Rollno = rollno;
	 this.    fname = fname;
	 this. lname = lname;
	this.	Physiscs = physiscs;
	this.	Chemistry = chemistry;
	this.	Maths = maths;
	}
	


	public String getRollno() {
		return Rollno;
	}


	public String getName() {
		return fname;
	}


	public int getPhysiscs() {
		return Physiscs;
	}


	public int getChemistry() {
		return Chemistry;
	}


	public int getMaths() {
		return Maths;
	}



	@Override
	public int compareTo(ProgramMarksheet m) {
		
		return Rollno.compareTo(m.Rollno);
	}



	public String getLname() {
		return lname;
	}


	}
