import java.util.Scanner;
public class LearnCoding3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= sc.nextInt();
        //Method 1
//        if (num>0){
//            System.out.println("positive number");
//        }
//
//        else if(num<0)
//            System.out.println("negative number");
//        else
//            System.out.println("Zero");
        //Method 2
//        if(num>=0){
//            if(num==0)
//                System.out.println("zero");
//            else
//                System.out.println("positive");
//        }
//        else
//            System.out.println("negative");
        if (num==0){
            System.out.println("zero");
        }
        else {
            String result=(num>0)? "positive":"negative";
            System.out.println(result);
        }



    }
}
