import java.util.Scanner;
public class LearnCoding6 {
    public static void main(String[] args) {
        int marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks:");
        marks= sc.nextInt();
        if(marks<0 || marks>100){
            System.out.println("invalid");
        }
        else if(marks<50){
            System.out.println("Grade F");
        }
        else if (marks>=50 && marks<60){
            System.out.println("Grade E");
        }
        else if (marks>=60 && marks<70){
            System.out.println("Grade C");
        }
        else if (marks>=70 && marks<80){
            System.out.println("Grade B");
        }
        else if (marks>=80 && marks<90){
            System.out.println("Grade A");
        }
        else {
            System.out.println("Grade A++");
        }




    }
}
