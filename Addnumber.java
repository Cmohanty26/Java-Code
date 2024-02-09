import java.util.Scanner;
public class Addnumber {
    public static void main(String[] args) {
        int number=20;
        int sum=Addnumber(number);
        System.out.println("sum="+sum);
    }
    public static int Addnumber(int num){
        if (num!=0)
            return num+Addnumber(num-1);
        else
            return num;
    }
}
