import java.util.*;
public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        /* int[] mark=new int[5];
        mark[0]=90;//phy
        mark[1]=91;//chem
        mark[2]=93;//math
        mark[3]=94;//bio
        mark[4]=95;//eng
        for (int i=0;i<5;i++){
            System.out.println(mark[i]);
        }*/
        //input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        //output
        int x = sc.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("x found at index:" + i);
            }
        }

    }
}
