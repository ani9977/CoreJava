package Thread;

public class ThreadInfo {
	public static void main(String[] args) {
		Thread t = new Thread("My Thread");
		log("",t);

	}

	public static void log(String indent, Thread t) {
		System.out.println(indent + "Thread Name :" + t.getName());
		System.out.println(indent + "ID:" + t.getId());
		System.out.println(indent + "Priorty:" + t.getId());
		System.out.println(indent + "State:" + t.getState());
		System.out.println(indent + "Thread Group:" + t.getThreadGroup().getName());
		System.out.println(indent + "is alive:" + t.isAlive());
		System.out.println(indent + "is daemon:" + t.isDaemon()+"\n");

	}

}
