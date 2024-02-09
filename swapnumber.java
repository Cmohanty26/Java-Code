import java.util.Scanner;
public class swapnumber {
    public static void main(String[] args) {
int temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a :");
        int a= sc.nextInt();
        System.out.println("enter the value of b:");
        int b= sc.nextInt();


    System.out.println("before the swapping the value of a and b is:"+a+""+b);
        {
            temp=a;
            a=b;
            b=temp;
            System.out.println("after the swapping the value of a and b is:"+a+""+b);
        }
    }
}
