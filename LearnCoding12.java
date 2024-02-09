import java.util.Scanner;
public class LearnCoding12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements of the array:");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
            System.out.println("\n Array Elements are:\n");
            for ( i=0;i<n;i++) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
