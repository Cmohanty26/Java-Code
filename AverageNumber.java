import java.util.Scanner;
public class AverageNumber {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double sum = 0;

            for (int i = 1; i <= 10; i++) {
                System.out.print("Enter number " + i + ": ");
                double number = scanner.nextDouble();
                sum += number;
            }

            double average = sum / 10;

            System.out.println("Sum of the 10 numbers is: " + sum);
            System.out.println("Average of the 10 numbers is: " + average);

            scanner.close();
        }
    }



