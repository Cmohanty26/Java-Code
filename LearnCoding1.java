import java.util.Scanner;
public class LearnCoding1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        int i=1;
        //Using while loop statement
//        while(i<=n){
//            System.out.println(i+ " ");
//            i++;
//
//        }
        //using For loop statement
//        for(int i=1;i<=n;i++){
//            System.out.println(i+ " ");
//        }
        //using do while loop statement
        do{
            System.out.println(i+" ");
            i++;

        }
        while (i<=n);

    }
}
