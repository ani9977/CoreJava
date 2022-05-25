package Inheritance;

public class person {
        private String firstname = "aniket";
        private String lastname = "sirota";
        private String Address = "indore";
        
        public person() {
        	System.out.println("person Default constructor");
        }
        
        public person (String fn,String ln) {
        	this();
        	firstname = fn;
        	lastname = ln;
        	System.out.println("2 parameter constructor called");
        }
           public person(String fn,String ln,String address) {
                  this(fn, ln);
                  this.Address=address;
                  System.out.println("3 parameter constructor called");
           
        		
        	}
			
		}
        
        

