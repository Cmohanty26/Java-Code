import java.util.Scanner;

public class pratices25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st subject mark");
        float a= sc.nextFloat();
        System.out.println("enter the 2nd subject mark");
        float b=sc.nextFloat();
        System.out.println("enter the 3rd subject mark ");
        float c= sc.nextFloat();
        float cgpa=(a+b+c)/30;
        System.out.println(cgpa);

    }
}
