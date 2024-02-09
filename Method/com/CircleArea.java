package Method.com;

public class CircleArea {

	public static void main(String[] args) {
		
		Circle c=new Circle();
		
	double Area=c.getArea(4);
	System.out.println("Area of circle is:"+ Area);

	}

}
class Circle{
	public double getArea(int r) {
		float pi=3.14f;
		double area=pi*r*r;
		return area;
	}
	
}
