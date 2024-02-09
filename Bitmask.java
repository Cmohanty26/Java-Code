import java.util.Scanner;
public class Bitmask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;

            //bit mask
       /* if((bitMask & n)==0){
            System.out.println("bit was zero");
        }
        else {
            System.out.println("bit was one");
        }*/
            //set mask
       /* int newNumber=bitMask | n;
        System.out.println(newNumber);*/
            //clear mask
          /*  int notBitmask = ~(bitMask);
            int newNumber = notBitmask & n;
            System.out.println(newNumber);*/
        if (oper == 1) {
            //set
            int newNumber=bitMask |n;
            System.out.println(newNumber);
        }
        else{
            //clear
            int newBitmask=~(bitMask);
            int newNumber=newBitmask & n;
            System.out.println(newNumber);
        }
    }
}
