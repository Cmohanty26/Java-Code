import java.util.Scanner;
public class functionsum {
    public static  int calculatesum(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number a:");
        int a=sc.nextInt();
        System.out.println("enter the second number b:");
        int b= sc.nextInt();
        int sum= calculatesum(a,b);
        System.out.println("the additional result is:"+ sum);
    }
}
