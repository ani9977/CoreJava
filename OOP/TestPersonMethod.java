package OOP;
import java.text.ParseException;
public class TestPersonMethod {

	public static void main(String[] args) throws ParseException {
		Personmethod s=new Personmethod();
		s.setName("aniket");
		s.setDate("2/10/2002");
		s.setAddress("indore");
		
		s.getName();
		s.getAddress();
		s.getDate();
		
		System.out.println("Name="+s.getName());
		System.out.println("Address="+s.getAddress());
		System.out.println("DOB="+s.getDate());
		


Account A = new Account();{
	
A.setNumber("9977302411");
A.setAccount("saving");
A.setBalance(7646.87);

A.getNumber();
A.getAccount();
A.getBalance();

System.out.println("Mobile="+A.getNumber());
System.out.println("Account="+A.getAccount());
System.out.println("Balance="+A.getBalance());


Automobile M = new Automobile();

M.setColor("Black");
M.setSpeed(240);
M.setMake("creta");
M.setgear(6);

M.getColor();
M.getSpeed();
M.getMake();
M.getColor();

System.out.println("color="+M.getColor());
System.out.println("speed="+M.getSpeed());
System.out.println("maker="+M.getMake());
System.out.println("gear="+M.getColor());

}
}
}