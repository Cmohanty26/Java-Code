import java.util.Scanner;
public class pratices35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
      //  for (int i = 1; i <= 10; i++) {
        for (int i = 10; i >1; i--) {
            System.out.printf("%d * %d=%d\n", n, i, n * i);

        }
    }
}
