import java.util.Scanner;

public class pratices53 {
    static void multiplication(int n){
        for (int i=1;i<=10;i++){
            System.out.format("%d * %d=%d\n",n,i,n*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        int n= sc.nextInt();
        multiplication(n);
    }
}
