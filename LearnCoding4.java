import java.util.Scanner;
public class LearnCoding4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number");
        int x= sc.nextInt();
        System.out.println("Enter the second number");
        int y= sc.nextInt();
        System.out.println("The addition of " + x + " and "+ y +" is: "+(Add(x,y)));
        System.out.println("The substraction of "+ x +"and "+ y +"is:"+(Subtrct(x,y)));
        System.out.println("The multiplication of "+x+"and"+y+"is:"+(Multiply(x,y)));
        System.out.println("The division of"+x+"and"+y+"is:"+(Divison(x,y)));
        System.out.println("The power of"+x+"and"+y+"is:"+(power(x,y)));
        System.out.println("The modolus of "+x+" and "+ y+ " is:"+(moduols(x,y)));


    }
    static int Add(int x,int y){
        int sum;
        sum=x+y;
        return sum;
    }
    static int Subtrct(int x,int y){
        int sub;
        sub=x-y;
        return sub;
    }
    static int Multiply(int x,int y){
        int product;
       product=x+y;
        return product;
    }
    static int Divison(int x,int y){
        int div;
        div=x+y;
        return div;
    }
    static double power(int x,int y) {
       double Power;
        Power = Math.pow(x,y);
        return Power;
    }
    static int moduols(int x,int y){
        int rem;
        rem=x%y;
        return rem;
    }

}
