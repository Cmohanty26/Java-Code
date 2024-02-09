import java.util.*;

public class dsa1 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        Printpattern(n);


    }
    public static void Printpattern(int n){
        if (n==0){
            return;
        }
        System.out.println(n+" ");
        Printpattern(n-1);
        System.out.println(n+" ");
        Printpattern(n-1);
        System.out.println(n+" ");
    }
}
