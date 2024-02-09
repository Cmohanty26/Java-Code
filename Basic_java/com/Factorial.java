package Basic_java.com;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int x = sc.nextInt();
		int result = 1;
		for(int i=1;i<=x;i++) {
			result=result*i;
			
		}
		System.out.println("factorial of :" + x + "is" + result);

	}

}
