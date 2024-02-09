import java.util.Scanner;

public class pratices47 {
    static void pattern1(int n){
        //for (int i=0;i<=n;i++){
        for (int i=1;i<=n;i++){
           // for (int j=0;j<i+1;j++){
            for (int j=1;j<=(n-i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of lines:");
        int n= sc.nextInt();
        System.out.println("the required pattern is:");
        pattern1(n);
    }
}
