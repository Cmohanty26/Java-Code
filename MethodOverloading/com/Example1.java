package MethodOverloading.com;

public class Example1 {
	//method overloading program
	static void foo() {
		System.out.println("Hello Chandan");
	}
		static void foo(int a) {
			System.out.println("Hello Chandan" + a + " How are you");
		}
		static void foo(int a,int b) {
			System.out.println("Hello Chandan" + a + " How are you" + b + " I am comig from balasore");
		}


	public static void main(String[] args) {
		foo();
		foo(1);
		foo(1,2);
	}	

}
