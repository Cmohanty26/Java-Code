import java.util.Scanner;
public class pratices7 {
    public static void main(String[] args) {
        float r;
        double pi=3.14,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of circle");
        r= sc.nextFloat();
        area=pi*r*r;
        System.out.println(area);

    }
}
