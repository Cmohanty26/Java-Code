package Object.com;

public class Test1 {

	public static void main(String[] args) {
		Multiplication t=new Multiplication();
		int result=t.m1(10,20);
		System.out.println("The multiplication reultlt is:"+result);

	}

}
class Multiplication{
	public int m1(int a,int b) {
		int multi=(a*b);
		return multi;
	}
}
