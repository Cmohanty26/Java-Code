import java.util.Scanner;

public class pratices52 {
    static int nSum(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int num= sc.nextInt();

        System.out.println("The sum of first"+num+"th natural number is:"+nSum(num));

    }
}
