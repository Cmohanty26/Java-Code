import java.util.Scanner;

public class Palindrome {
    public static boolean ispalindrome(int number){
        int reverse=0,temp=number;
        while (temp!=0){
            reverse=reverse*10+temp%10;
            temp=temp/10;


        }
        if(number==reverse)
            return true;
        else
            return false;
    }





    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number= sc.nextInt();
        if(ispalindrome(number))
            System.out.println(number + "is a palindrome number");
        else
            System.out.println(number + "is not a palindrome number");

    }
}
