package Method.com;




public class Method1 {
	public int addNumber(int a,int b) {
		int sum=a+b;
		return sum;
		
	}
	public int subNumber(int a,int b) {
		int sub=a-b;
		return sub;
	}
	public int multiNumber(int a,int b) {
		int multi=a*b;
		return multi;
	}
	public int divNumber(int a,int b) {
		int div=a/b;
		return div;
	}
	public int modNumber(int a,int b) {
		int mod=a%b;
		return mod;
	}
	public void Exam() {
		System.out.println("pass");
	}
	

	public static void main(String[] args) {
//		int num1=29;
//		int num2=30;
		Method1 t=new Method1();
		int result=t.addNumber(60, 70);
		int substraction=t.subNumber(20, 10 );
		int multiply=t.multiNumber(10, 20);
		int division=t.divNumber(50, 5);
		int modulation=t.modNumber(10,3);
		
//		System.out.println("The substraction is:"+t.subNumber(20, 10));
		
		t.Exam();
		System.out.println("sum is:"+ result);
		System.out.println("sub is:"+ substraction);
		System.out.println("multiplication is:"+ multiply);
		System.out.println("Div is:"+ division);
		System.out.println("Modulation is:"+ modulation);
		
		
		
		
		

	}

}
