package LambdaExpression;

public class TestStringLmbda {
	public static void main(String[] args) {
		
		Lmbda Concatenate = (a,b)-> {return a+b;};
		
		String a = "lucifer";
		String b = "morning Star";
		
		System.out.println(a.concat(b));
	}

}
