package Inheritance;

public class Businessman  implements Richman, Socialworker{
	private String name ;
	private String Addresss ;
	
	public void donation () {
		System.out.println("Giving Donation");
	}
    public void earnmoney() {
    	System.out.println("earned by company");
    }
    public void party() {
    	System.out.println("party at kayro");
    }
    public void helptoothers() {
    	System.out.println("helptoothers by socialwoker");
    }
    
}
