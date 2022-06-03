package Serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	private int id;
	private String FirstName;
	private String LastName;
	private transient String tempValue;

	public Employee() {

	}

	public Employee(int id, String FirstName, String LastName) {
		this.id = id;
		this.FirstName = FirstName;
		this.LastName = LastName;
	}

	public int getId() {
		return id;
	}

	

	public String getFirstName() {
		return FirstName;
	}

	

	public String getLastName() {
		return LastName;
	}

	

	public String getTempValue() {
		return tempValue;
	}

	

}
