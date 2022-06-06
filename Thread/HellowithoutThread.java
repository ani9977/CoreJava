package Thread;

public class HellowithoutThread {

	private String name = null;

	public HellowithoutThread(String name) {
		this.name=name;

	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i + name);

		}
	}

	public static void main(String[] args) {

		HellowithoutThread t1 = new HellowithoutThread("mossewaala");
		HellowithoutThread t2 = new HellowithoutThread("chims");
		t1.run();
		t2.run();

	}
}
