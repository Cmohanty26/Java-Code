import java.util.Scanner;
public class functiofactorial {
    public static void printFactorial(int n){
      int factorial=1;
      for (int i=n;i>=1;i--){
          factorial=factorial*i;
      }
        System.out.println(factorial);
      return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n= sc.nextInt();
        printFactorial(n);
        System.out.println("the factorial number is:"+n);
    }
}
