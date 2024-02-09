package Method.com;

public class Maths {

	public static void main(String[] args) {
		Arithmatic m1=new Arithmatic();
		int sum=m1.add(20, 30);
		System.out.println("The sum is:"+sum);
		int substract=m1.sub(30, 10);
		System.out.println("The substaction is:"+substract);

	}

}

class Arithmatic{
	public int add(int a,int b) {
		int addition=a+b;
		return addition;
		
	}
	public int sub(int a,int b) {
		int substraction=a-b;
		return substraction;
	}
}
