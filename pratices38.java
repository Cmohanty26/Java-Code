import java.util.Scanner;
public class pratices38 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the no:");
        int n= sc.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++) {
            sum += (2 * i)+ 1 ;
        }

            System.out.println("the additional result is:"+sum);
    }
}
