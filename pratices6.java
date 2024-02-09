import java.util.Scanner;
public class pratices6 {
    public static void main(String[] args) {
        int a,b,c,d,e,total;
        float avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st subject no");
         a= sc.nextInt();
        System.out.println("enter the 2nd subject no");
         b= sc.nextInt();
        System.out.println("enter the 3rd subject no");
        c=sc.nextInt();
        System.out.println("enter the 4th subject no");
        d=sc.nextInt();
        System.out.println("enter the 5th subject no");
        e= sc.nextInt();
        total=a+b+c+d+e;
        System.out.println(total);
        avg=total/5;
        System.out.println(avg);
    }
}
