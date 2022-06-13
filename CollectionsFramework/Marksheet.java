package CollectionsFramework;

public class Marksheet {
	private String RollNo;
	private String Name;
	private int Physics;
	private int Chemistry;
	private int Maths;
	public Object fname;

	public Marksheet(String rollNo, String name, int physics, int chemistry, int maths) {

		RollNo = rollNo;
		Name = name;
		Physics = physics;
		Chemistry = chemistry;
		Maths = maths;
	}

	public String getRollNo() {
		return RollNo;
	}

	public String getName() {
		return Name;
	}

	public int getPhysics() {
		return Physics;
	}

	public int getChemistry() {
		return Chemistry;
	}

	public int getMaths() {
		return Maths;
	}
		
	
	
	
	
	
	}
