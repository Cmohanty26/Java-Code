import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstName="chandan";
        String lastName="Mohanty";
        String fullName=firstName + "@" + lastName;
        System.out.println(fullName.length());
        //charAt
        for (int i=0;i<firstName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
