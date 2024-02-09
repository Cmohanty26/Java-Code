import java.util.Scanner;

public class practice74 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance in kilometer:");
        double m=sc.nextFloat();
        double miles=(double) (0.6213711922*m) ;
        System.out.println("distance in miles in will be:"+ miles);
    }
}
