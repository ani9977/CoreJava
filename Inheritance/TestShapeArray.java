package Inheritance;

public class TestShapeArray extends Shape {

	public static void main(String[] args) {
		Shape s[]= new Shape[3];
		s[0]= new Rectangle();
		s[1]= new Circle();
		s[2]= new Triangle();
		Rectangle r =  (Rectangle) s[0];
		Shape s4 = new Shape();
		r.setLength(222); 
		r.setWidth(86);
		Circle c = (Circle) s[1];
		c.setRadius(22);
		Triangle t = (Triangle) s[2];
		t.setBase(11);
		t.setHeight(876);
		
		for (int i = 0; i < s.length; i++) {
			double d = s[i].area();
			
			System.out.println(d);
		}		
	}
}