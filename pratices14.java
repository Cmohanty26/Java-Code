import java.util.Scanner;

public class pratices14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number whose factorial to be calculated:");
        int a= sc.nextInt();
        int factorial=1,i;

        for (i=1;i<=a;i++){
            factorial=factorial*i;
        }
        System.out.println("factorial of"+a+"is:"+factorial);
    }
}
