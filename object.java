import java.util.Scanner;
public class object {
    int a,b;
    void add(){
        System.out.println("the addition result is:"+(a+b));
    }
    void sub(){
        System.out.println("the substraction result is:"+(a-b));
    }
    void mul(){
        System.out.println("the multiplication is:"+(a*b));
    }
    void div(){
        System.out.println("the division result is:"+(a/b));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two variable a and b:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        {
            System.out.println("the additional result is:"+(a+b));
            System.out.println("the substraction result is:"+(a-b));
            System.out.println("the multiplication result is:"+(a*b));
            System.out.println("the division result is: "+(a/b));



        }
    }
}
