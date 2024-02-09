import java.util.Scanner;
public class pratices36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number whose factorial to be calculated:");
        int n= sc.nextInt();
        int factorial=1;
        int i=1;
       // for (int i=1;i<=n;i++){
        while (i<=n){
            factorial*=i;
            i++;


        }
        System.out.println("factorial for "+ n +" is :"+factorial);
    }
}
