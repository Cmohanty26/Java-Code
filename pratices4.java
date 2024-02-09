import java.util.Scanner;
public class pratices4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st no a");
        int a= sc.nextInt();
        System.out.println("enter the 2nd no b");
        int b= sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("value of 1st variable:"+a);
        System.out.println("value of 2nd variable:"+b);
    }
}
