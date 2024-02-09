class Once{
    //method to calculate square value
    static void calculate(double x){
        System.out.println("Square value="+(x*x));
    }
}
class Twice extends Once{
     //method to calculate square root value
    static void calculate(double x){
        System.out.println("Square root="+Math.sqrt(x));
    }
}
public class Day16 {
    public static void main(String[] args) {
        //super class reference refers to sub class object
        Once o=new Twice();
        //call calculate() method using super class reference
        o.calculate(25);

    }
}
