import java.util.Scanner;
public class SwitchProgram1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day of week");
       int day= sc.nextInt();
        switch (day){
            case 1:
                System.out.println("The day is sunday");
                break;
            case  2:
                System.out.println("The day is monday");
                break;
            case 3:
                System.out.println("The day is tuesday");
                break;
            default:
                System.out.println("The day is unknown day");
        }
    }
}
