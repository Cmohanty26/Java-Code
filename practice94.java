import java.util.Scanner;

public class practice94 {
    public static void main(String[] args) {
        int[] marks=new int[3];
        marks[0]=12;
        marks[1]=20;
        marks[2]=45;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of index");
        int ind= sc.nextInt();
        try {
            System.out.println("Welcome to our program");
            try {
                System.out.println(marks[ind]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("sorry this index does not exist");
                System.out.println("Exception in level 2");
            }
        }

        catch (Exception e){
            System.out.println("Exception in level 1");
        }
    }
}
