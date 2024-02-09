import java.util.Scanner;

public class practice101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= i; j++) {
                //sum+=i;

                sum++;
            }


        }
        System.out.println("The sum of n number is:" + sum);
    }
}

