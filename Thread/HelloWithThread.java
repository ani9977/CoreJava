package Thread;

public class HelloWithThread extends Thread {
	private String name = null;
	public HelloWithThread(String ThreadName) {
		name = ThreadName;
		
		
	}
	
	public void run () {
		for (int i = 0; i <50; i++) {
			System.out.println(i+" hello "+name);
	
		}
		
	}
	 public static void main(String[] args) {
		HelloWithThread t1 = new HelloWithThread("BRO");
		HelloWithThread t2 = new HelloWithThread("Code");
		
		t1.start();
		t2.start();
		
	}
}
