import java.util.Scanner;
public class LearnCoding10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1= sc.nextInt();
        System.out.println("Enter the second number:");
        int num2= sc.nextInt();
//        if(num1>num2)
//            System.out.println(num1+"is greater than"+num2);
//        else if(num2>num1)
//            System.out.println(num2+"is greater than"+num1);
//        else
//            System.out.println("Both number are equal");
//        sc.close();


        //Method 2
        int largest=0;
        if(num1==num2)
//            System.out.println("Both numbers are equal");
//        else
//            largest=(num1>num2)? num1:num2;
//        System.out.println(largest+ "is the largest");

            //Method 3
            if (num1==num2)
                System.out.println("Both numbers are equal");
        else
                System.out.println(Math.max(num1,num2));
        sc.close();
    }
}
