package OOP;
import java.lang.reflect.Constructor;
import java.text.ParseException;
public class Testconstructing {

	public Testconstructing() {
		
	}

	public static void main(String[] args)throws ParseException {
		
		constructing c= new constructing("aniket","indore","19");
		
		c.setDate("2/10/2002");
		
		
		c.getName();
		c.getAddress();
		c.getDate();
		c.getage();
		
		System.out.println("name="+c.getName());
		System.out.println("Address="+c.getAddress());
		System.out.println("date="+c.getDate());
		System.out.print("age="+c.getage());
		
	}
	
	
	
	
	
	
	
	
	
	
	
}





















