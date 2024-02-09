import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many fibonaccis ?");
        int n=sc.nextInt();
        float f1=0,f2=1;
        System.out.println(f1);
        System.out.println(f2);
        float f=f1+f2;
        System.out.println(f);
        int count=3;
        while (count<n){
            f1=f2;
            f2=f;
            f=f1+f2;
            System.out.println(f);
            count++;
        }
    }
}
