import java.util.Scanner;
public class rectanglearea {
    public static void main(String[] args) {
        int l,b,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of rectangle");
        l= sc.nextInt();
        System.out.println("enter the base of rectangle");
        b= sc.nextInt();
        area=l*b;
        System.out.println("the area of rectangle is:"+area);
        
    }
}
