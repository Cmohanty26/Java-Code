import java.util.Scanner;
public class LearnCoding2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a age:");
        int age=sc.nextInt();
//        if(age>=18){
//            System.out.println("vote");
//        }
//            else
//            System.out.println("cant vote");
        String result=age>18 ? "vote ":"not vote";
        System.out.println(result);
            sc.close();

    }
}
