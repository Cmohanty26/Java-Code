package Basic_java.com;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping the value is :" + a);
		System.out.println("After swapping the value is :" + b);
		

	}

}
