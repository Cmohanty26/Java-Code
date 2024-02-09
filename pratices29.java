import java.util.Scanner;
public class pratices29 {
    public static void main(String[] args) {
        byte m1,m2,m3;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your physics mark:");
        m1=sc.nextByte();
        System.out.println("enter your chemistry mark:");
        m2=sc.nextByte();
        System.out.println("enter your math mark:");
        m3=sc.nextByte();
        float avg=(m1+m2+m3)/3.0f;
        System.out.println("your average percentage is:"+avg);
        if (avg>40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("congratulation,you have been promoted:");
        }
        else
            System.out.println("sorry,you have not been promoted:");
    }
}
