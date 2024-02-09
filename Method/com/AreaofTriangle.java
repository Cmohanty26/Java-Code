package Method.com;

public class AreaofTriangle {

	public static void main(String[] args) {
	Triangle t=new Triangle();
	float Area=t.m1(60,70);
	System.out.println("The area of triangle is:"+ Area);

	}

}
class Triangle{
	public float m1(int b,int h) {
		float Area=(b*h)/2;
		return Area;
	}
}
