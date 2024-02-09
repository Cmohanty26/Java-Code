import java.util.Scanner;

public class practice102 {
    public static void main(String[] args) {
        char operator;
        double num1,num2,result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the operator to which is used:+,-,*,/");
        operator=sc.next().charAt(0);
        System.out.println("Enter the 1st number");
        num1= sc.nextDouble();
        System.out.println("Enter the 2st number");
        num2= sc.nextDouble();
        switch (operator){
            case '+':
                result=num1+num2;
                System.out.println("The additional result is:"+result);
                break;
            case '-':
                result=num1-num2;
                System.out.println("The Substraction result is:"+result);
                break;
            case '*':
                result=num1*num2;
                System.out.println("The multiplication result is:"+result);
                break;
            case '/':
                result=num1/num2;
                System.out.println("The division result is:"+result);
                break;
            default:
                System.out.println("invalid operator");
        }
        sc.close();
    }
}
