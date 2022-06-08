package LambdaExpression;

public class TestLmbda {
	public static void main(String[] args) {
             
		 Lmbda add = (a,b) ->{return a+b;};
		 Lmbda multiply = (a,b) ->{return a*b;};
		 Lmbda Substraction = (a,b) ->{return a-b;};
		 Lmbda divide = (a,b) ->{return a/b;};

		 int a= 100;
		 int b= 30;
		 
		 System.out.println(add.Maths(a, b));
		 System.out.println(multiply.Maths(a, b));
		 System.out.println(Substraction.Maths(a, b));
		 System.out.println(divide.Maths(a, b));
		 
		 
		 
		 
	}

}

