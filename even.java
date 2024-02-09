import java.util.Scanner;
public class even {
    public static void main(String[] args) {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int no= sc.nextInt();
        if (no%2==0)
        {
            System.out.println("the number is even:");

        }
        else
        {
            System.out.println("the number is odd:");
        }
    }
}
