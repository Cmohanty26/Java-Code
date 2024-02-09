import com.sun.source.doctree.ThrowsTree;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "toString()";
    }

    @Override
    public String getMessage() {
        return " i'am getMessage()";
    }
}
public class practice99 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a= sc.nextInt();
        if(a<9){
            try {
                //throw new MyException();
                throw new ArithmeticException("i am a exception");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            }
        }
    }
}
