import java.util.Scanner;
public class SumofRem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int rem,sum=0;
        do{
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        while (n!=0);
        System.out.println("The sum of digits is:"+sum);
    }
    


}
