import java.util.Scanner;

public class pratices23 {
    public static void main(String[] args) {
        int a[]=new int[5];
        int b[]=new int[5];
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array element");
        for (i=0;i<=5;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("first array element");
        for (i=0;i<=5;i++){
            b[i]= sc.nextInt();
        }
        System.out.println("second array element");
        for(i=0;i<5;i++){
            b[i]=a[i];
            System.out.println("b[i]");
        }
    }
}
