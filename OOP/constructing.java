
package OOP;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class constructing {

	private String name ;
	private String Date;
	private String Address;
	private String age;
	SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
	
	
	public String getName() {
		return name;
	}
	public constructing(String name,String Address,String age) {
		this.name = name;
		this.Address= Address;
		this.age= age;
		
	}

public String getDate() {
		return Date;
	}
	public void setDate(String string) {
		Date = string;
	}
	public String getAddress() {
		return Address;
	}
	
	public SimpleDateFormat getS() {
		return s;
	}
	public void setS(SimpleDateFormat s) {
		this.s = s;
	}
	public String getage() {
		return age;
		
		
	}
	
	
	
	
	
	
}
