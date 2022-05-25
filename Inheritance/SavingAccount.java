package Inheritance;

public class SavingAccount extends overRidingAccount {
	
	public int getAmount() {
		int i = super.getAmount() + 100;
		return i;
		
		
	}

}
