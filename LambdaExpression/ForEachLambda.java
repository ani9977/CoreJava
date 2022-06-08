package LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class ForEachLambda {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("ram");
		l.add("shyam");
		l.add("mohan");
		l.forEach (c -> System.out.println(c));
		
	}

}
