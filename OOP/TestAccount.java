package OOP;

public class TestAccount {
       public static void main(String[] args) {
		
    	   Account A = new Account();
    	   
    	  A.setNumber("9977302");
    	  A.setAccount("saving");
    	  A.setBalance(7646.87);
    	  
    	  A.getNumber();
    	  A.getAccount();
    	  A.getBalance();
    	  
    	  System.out.println(A.getNumber());
    	  System.out.println(A.getAccount());
    	  System.out.println(A.getBalance());
	}
}
