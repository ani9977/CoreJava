package CollectionsFramework;

import java.util.Vector;

public class Instantiate {
	public static void main(String[] args) {
		Vector v = new Vector ();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(6);
		v.add(7);
		v.add(8);
		v.add(9);
		v.add(10);
		v.add(10);
		System.out.println(v.capacity());
		System.out.println(v.size());
	}

}
