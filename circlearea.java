import java.util.Scanner;
public class circlearea {
    public static void main(String[] args) {
        int r;
        double pi=3.14,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of a circle");
        r=sc.nextInt();
        area=pi*r*r;
        //System.out.println("area of circle:"+area);
        System.out.println(area);
    }
}
