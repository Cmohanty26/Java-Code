import java.util.Scanner;

public class pratices15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello what is your name:");
        String name=sc.nextLine();
        System.out.println("hello:"+name);
        System.out.println("how old are you ?");
        int age= sc.nextInt();
        System.out.println("you are:"+age+"years old");
    }
}
