import java.util.Scanner;
//convert kilometer to miles
public class pratices26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the distance in kilometer:");
        float km= sc.nextFloat();
        //kilometer to miles conversion
        float miles=(float)(0.6213711922 * km);
        System.out.println("distances in miles will be:"+miles);
    }
}
