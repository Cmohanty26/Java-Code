package Method.com;

public class Example2 {

	public static void main(String[] args) {
	Test a=new Test();
	char c=a.m1(90, '&');
	boolean b=a.m2(true, 8117889859l);
	float f1=a.m3(40, "Chandan");
	System.out.println(c);
	System.out.println(b);
	System.out.println(f1);

	}

}
class Test{
	public char m1(int x,char y) {
		char X='&';
		return X;
	}
	public boolean m2(boolean x,long y) {
		boolean Y=true;
		return Y;
	}
	public float m3(int x,String y) {
		return 33.04f;
	}
}
