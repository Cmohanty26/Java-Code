import java.util.Scanner;

public class pratices27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the physics mark:");
        float phy= sc.nextFloat();
        System.out.println("enter the chemistry mark: ");
        float chem= sc.nextFloat();
        System.out.println("enter the math mark:");
        float math= sc.nextFloat();
        System.out.println("enter the english mark:");
        float eng= sc.nextFloat();
        System.out.println("enter the odia mark:");
        float odia= sc.nextFloat();
        float total=(phy+chem+math+eng+odia);
        float percentage=(total/500)*100;
        System.out.println("your total percentage is:"+percentage);


    }

}
