import java.io.InvalidClassException;
import java.util.InputMismatchException ;
import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;
class invalidInputException extends InputMismatchException{
    public String toString(){
        return "Not a valid operation";
    }
    public String getMessage(){
        return "please enter  a valid operation";
    }
}
class ZeroException extends ArithmeticException{
    public String toString(){
        return "can not divide by zero";
    }
    public String getMessage(){
        return "please enter a number<=to 100000";
    }
}
class MaxMultiplierReachedException extends ArithmeticException{
    public String toString(){
        return "can not multiply by a number>7000";
    }
    public String getMessage(){
        return "plaese enter a number<=7000";
    }
}
public class practice110 {
    public static void main(String[] args) {
        int a, b;
        long sol;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 number");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a > 10000 || b > 10000)
            throw new MaxMultiplierReachedException();
        System.out.println("Enter the operation sign:");
        op = sc.next().charAt(0);
        switch (op) {
            case '+':
                sol = a + b;
                System.out.println("The additional result is:"+sol);
                break;
            case '-':
                sol = a - b;
                System.out.println("The substraction result is:"+sol);
                break;
            case '/':
                if (b == 0)
                    throw new ZeroException();
                else
                    sol = a / b;
                System.out.println("The division result is:"+sol);
                break;
            case '*':
                if (a > 7000 || b > 7000)
                    throw new MaxMultiplierReachedException();
                else
                    sol = a * b;
                System.out.println("The multiplication result is:"+sol);
                break;
              default:
            // throw new InvalidInputException();

             System.out.println("invalid operator");

        }
    }
}
