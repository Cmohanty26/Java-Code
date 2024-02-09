import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
       int a,b,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two variable to swap");
        a= sc.nextInt();
        b= sc.nextInt();
        //without using 3rd variable
   /* a=a-b;
    b=a+b;
    a=b-a;*/
        //using 3rd variable
        temp=a;
        a=b;
        b=temp;
        System.out.println("value of 1st variable:"+a);
        System.out.println("value of 2nd variable:"+b);
    }
}
