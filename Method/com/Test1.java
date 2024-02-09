package Method.com;

public class Test1 {

	public static void main(String[] args) {
	Itoms w=new Itoms();
	float result=w.m1();
	System.out.println("The float value is:"+ result);
	System.out.println("The itoms name is:"+w.name);
	System.out.println("The length of itoms is:"+w.length);
	System.out.println("The boolean value is:"+w.b);
	System.out.println("The char value is:"+w.c);

	}

}
class Itoms{
	public String name="Apple";
	public float length=1.10f;
	public boolean b=false;
	public char c='@';
	public float m1() {
		float f2=3.14f;
		return f2;
		
	}
	
	
}
