package Method.com;

public class AreaofTrapezoid {

	public static void main(String[] args) {
		Trapezoid t=new Trapezoid();
		float Area=t.m1(205, 100, 2);
		System.out.println("The area of trapezoid is:"+ Area);

	}

}
class Trapezoid{
	public float m1(int a,int b,int h) {
		float area=(((a+b)/2f)*h);
		return area;
	}
}
