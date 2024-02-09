import java.lang.Math;
import java.util.Scanner;
public class LearnCoding9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number is:");
        int x= sc.nextInt();
        table(x);
    }
    static void table(int x){
        int i;
        for(i=1;i<=10;i++){
            System.out.println(x+ "*"+ i + ":" + x*i);
        }
    }
}
