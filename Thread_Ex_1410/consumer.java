package Thread_Ex_1410;

public class consumer implements Runnable  {

	@Override
	public void run() {
	     System.out.println("Thread has ended");
		
	}
	public static void main(String[] args) {
		consumer c1= new consumer();
         
		System.out.println("JHAKAS");
		
		
	}

}
