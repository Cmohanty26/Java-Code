import java.util.Scanner;
public class pratices37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no:");
        int n= sc.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++) {
            sum += n * i;
        }
            System.out.println("the sum result is:"+sum);

    }
}
