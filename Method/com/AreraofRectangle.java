package Method.com;

public class AreraofRectangle {

	public static void main(String[] args) {
	Rectangle r=new Rectangle();
	int result=r.getArea(30, 20);
	System.out.println("The area of rectangle is:"+result);

	}

}
class Rectangle{
	public int getArea(int l,int b) {
		int Area=l*b;
		return Area;
	}
}
