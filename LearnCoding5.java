import java.util.Scanner;
public class LearnCoding5 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number");
//        int num= sc.nextInt();
        //Method 1
//        if(num%2==0)
//            System.out.println("Even number");
//        else
//            System.out.println("odd number");
        //Method2
//        String EvenOdd=(num%2==0)?"even":"odd";
//        System.out.println(EvenOdd);
//        sc.close();
        //Using Bitwise ops
        public static boolean isEven(int num){
            if ((num &1)==0)
                return true;
            else
                return false;



    }
    public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= sc.nextInt();
        if (isEven(num)==true)
            System.out.println("Even");
        else
            System.out.println("odd");
    }
}
