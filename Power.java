import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        System.out.println("enter x");
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println("enter n");
        int n=sc.nextInt();
        int result=1;
        for (int i=0;i<n;i++){

            result=result*x;

        }
        System.out.println("x to the power n is:"+result);
    }
}
