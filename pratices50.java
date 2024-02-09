import java.util.Scanner;

public class pratices50 {
    static void pattern4(int n) {
        if (n > 0) {
            pattern4(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers of lines:");
        int n= sc.nextInt();
        System.out.println("The required pattern is:");
        pattern4(n);
    }

}

