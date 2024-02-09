import java.util.Scanner;

public class pratices13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        if (age > 55){
                 System.out.println("it is senior citizen account ");
            }
        else if (age < 55 && age>21) {
                System.out.println("it is saving account ");
        }
        else if (age < 21) {
                System.out.println("inteligible");
            }
        }

    }




