import java.util.Scanner;

public class pratices19 {
    public static void main(String[] args) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number n:");
        n = sc.nextInt();


        int sum = 0;
        int count = 0;
        for (i = 1;i>=1;i++){
            if (i%2==0){
                sum=sum+i;
                count++;
            }
            if (count==n){
                break;
            }
        }
        System.out.println("sum is:"+sum);

    }
}
