import java.util.Scanner;
public class pratices33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int n= sc.nextInt();
        int sum=0;
        //for (int i=0;i<n;i++){
        int i=0;
        while(i<n){


            sum=sum+(2*i);
            i++;
        }
        System.out.println("sum of even number:");
        System.out.println(sum);

    }
}
