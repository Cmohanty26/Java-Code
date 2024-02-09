import java.util.Scanner;
public class LearnCoding11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int n= sc.nextInt();
        System.out.println("Enter the number of Columns");
        int m= sc.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("Enter the items in the 2D array");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("The items in the 2D array are:");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.println(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

}
