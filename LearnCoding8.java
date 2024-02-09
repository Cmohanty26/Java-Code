import java.util.*;
import java.lang.Math;
public class LearnCoding8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int x= sc.nextInt();
        System.out.println("The square root of" + x +" is:"+ SquareRoot(x));
        int y= sc.nextInt();
        System.out.println("The cube root of" + x +"is"+ CubeRoot(x));
    }
    static double SquareRoot(int x){
        double sq;
        sq=Math.sqrt(x);
        return sq;
    }
    static double CubeRoot(int x){
        double cb;
        cb=Math.cbrt(x);
        return cb;

    }
}
