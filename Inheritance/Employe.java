package Inheritance;

public class Employe extends person {
          private String designation = null;
           public Employe(String string, String string2) {
        	   System.out.println("default constructor");
           }
           
           public Employe (String fn,String ln, String des) {
        	   super(fn, ln);
        	   designation = des;
        	   System.out.println("2 parameter constructor");
        	   
           }
       	public static void main(String[] args) {
    		person p = new person ("ajay","vikas","mohan");
    	}
              
            	
		  
		
}

