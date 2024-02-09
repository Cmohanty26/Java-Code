import java.util.Scanner;
public class Prepinsta1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weight in kilogram");
        double weigtkgs= sc.nextDouble();
        convert(weigtkgs);

    }
    public static void convert(double kgs){
        double WeightGms,WeightMg;
        WeightGms=kgs*1000;
        WeightMg=WeightGms*1000;
    System.out.println("The convert weight in grams is=:"+ WeightGms);
        System.out.println("The convert weight in miligrams is=:" + WeightMg);

    }
}
