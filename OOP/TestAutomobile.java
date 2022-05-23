package OOP;

public class TestAutomobile {
	
	public static void main(String[] args) {
		
		Automobile M = new Automobile();
		       
		M.setColor("Black");
		M.setSpeed(240);
		M.setMake("creta");
		
		
		
		M.getColor();
		M.getSpeed();
		M.getMake();
		
		
		
		System.out.println("color="+M.getColor());
		System.out.println("speed="+M.getSpeed());
		System.out.println("maker="+M.getMake());
		
		
		
		
	}

}
