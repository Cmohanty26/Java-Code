import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int num= sc.nextInt();
        if (num>=1 && num<=100)
            System.out.println("The withdraw amount is 500");
        else if (num>200 && num<=300)
            System.out.println("The withdraw amount is 1500");
        else if (num>300 && num<=400)
            System.out.println("The withdraw amount is 2000");
        else if (num>400 && num<=500)
            System.out.println("The withdraw amount is 2500");
        else if (num>500 && num<=600)
            System.out.println("The withdraw amount is 3000");
        else
            System.out.println("The withdraw amount is out of range");



    }
}
