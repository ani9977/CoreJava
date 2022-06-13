package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestProgramMarksheet {
	public static void main(String[] args) {
		ArrayList Marksheets = new ArrayList();
		ProgramMarksheet m1 = new ProgramMarksheet("36", "Lucifer","kumawat", 56, 67, 69);
		ProgramMarksheet m2 = new ProgramMarksheet("34", "morning","verma", 65, 76, 96);

		Marksheets.add(m1);
		Marksheets.add(m2);

		Collections.sort(Marksheets);
		
		Iterator I = Marksheets.iterator();
		while (I.hasNext()) {
			ProgramMarksheet m = null;
			m = (ProgramMarksheet) I.next();
			System.out.print(m.getRollno()+" , ");
			System.out.print(m.getName()+"  ,  ");
			System.out.print(m.getLname()+" , ");
			System.out.print(m.getPhysiscs()+" ,  ");
			System.out.print(m.getChemistry()+"  ,  ");
			System.out.println(m.getMaths());
			

		}

	}

}
