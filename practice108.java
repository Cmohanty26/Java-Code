import java.util.Scanner;

public class practice108 {
    public static void main(String[] args) {
        boolean flag=true;
        int[] marks=new int[3];
        marks[0]=90;
        marks[1]=6;
        marks[2]=8;
        Scanner sc=new Scanner(System.in);
        int index;
        int i=0;
        while (flag && i<5){
            try {
                System.out.println("enter the value of index ");
                index= sc.nextInt();
                System.out.println("The value of marks[index] is:"+marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid index");
                i++;
            }
            if (i>=5){
                System.out.println("error");
            }
        }
    }
}
