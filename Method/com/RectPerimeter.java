package Method.com;

public class RectPerimeter {

	public static void main(String[] args) {
		Perimeter r=new Perimeter();
		float result=r.m1(10, 20);
		System.out.println("The rectangle is: " + result);
		
		
		
		

	}

}
class Perimeter{
	public float m1(int l,int b) {
		float per=2*(l+b);
		return per;
		
	}
	
	
}
