import java.util.Scanner;

public class pratices55 {
    static void fun1(int n){
        if(n>0){
            System.out.println(n);
            fun1(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no:");
        int n= sc.nextInt();
        fun1(n);
    }
}
