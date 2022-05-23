package OOP;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Personmethod {
             
	private String name ;
    private Date Date;
    SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
    private String address;  
	public String getName() {
	      return name;	
	}
	public String getDate() {
		String s1 = s.format(Date);
		return s1;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public SimpleDateFormat getS() {
		return s;
	}
	public void setDate(String s2) throws ParseException {
		Date=s.parse(s2);
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}	
		private String number;
	       private String account;
	       private Double balance;
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public String getAccount() {
			return account;
		}
		public void setAccount(String string) {
			this.account = string;
		}
		public Double getBalance() {
			return balance;
		}
		public void setBalance(Double balance) {
			this.balance = balance;
			
			
			
		}
			private String color;
			private int speed;
			private String make;
			private int gear=6;
			public String getcolor(){
			     return color;
			     
			}
			public String getColor() {
				return color;
			}
			public void setColor(String color) {
				this.color = color;
			}
			public int getSpeed() {
				return speed;
			}
			public void setSpeed(int speed) {
				this.speed = speed;
			}
			public String getMake() {
				return make;
			}
			public void setMake(String make) {
				this.make = make; 	
			}
			public void setgear(int gear) {
                    this.gear=6;
			}
			public int getgear() {
				return gear;
						
}			
}