package CollectionsFramework;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class TestMarksheet {
	public static void main(String[] args) {
		List l = new ArrayList();
		Marksheet m1 = new Marksheet("30013456", "Lucifer", 44, 45, 48);
		l.add(m1);
		Marksheet m2 = new Marksheet("300132", "Professor", 43, 41, 32);
		l.add(m2);
		// l.contains(m2);
		Iterator i = l.iterator();
		while (i.hasNext()) {
			Marksheet m = null;
			m = (Marksheet) i.next();

			System.out.print("name=" + m.getName() + "  , ");
			System.out.print("rollno=" + m.getRollNo() + " , ");
			System.out.print("Physics=" + m.getPhysics() + "  , ");
			System.out.print("Chemistry=" + m.getChemistry() + "  , ");
			System.out.println("maths=" + m.getMaths());

		}
	}
}