import java.util.Scanner;
public class Day28 {
    public static void PrintMyName(String name){
        System.out.println(name);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name= sc.next();
        System.out.println("My name is :"+name);
        PrintMyName(name);

    }
}
