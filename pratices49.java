import java.util.Scanner;

public class pratices49 {
    static void pattern3(int rows){
        if (rows>0){
            for (int i=rows;i>0;i--){
                System.out.print("*");
            }
            System.out.println();
            pattern3(rows-1);
    }

}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int n=sc.nextInt();
        System.out.println("The required pattern is:");
        pattern3(n);
    }
}
