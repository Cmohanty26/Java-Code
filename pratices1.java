import java.util.Scanner;
public class pratices1 {
    public static void main(String[] args) {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.printf("enter the no");
        x= sc.nextInt();
        if (x%2==0){
            System.out.printf("the no is even");

        }
        else
            System.out.println("the no is odd");
    }


}
