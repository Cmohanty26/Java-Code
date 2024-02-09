import java.util.Scanner;
public class Greater {
   public  static int getGreater(int a,int b){
       if(a>b){
           return a;
       }
       else {
           return b;
       }
   }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st no ");
        int a= sc.nextInt();
        System.out.println("enter the 2nd no");
        int b= sc.nextInt();
        System.out.println("the greater no is:"+getGreater(a,b));
    }
}

