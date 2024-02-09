import java.util.Scanner;

class Rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int parameter(){
        return 2*(length+breadth);
    }
}
public class pratices60 {
    public static void main(String[] args) {

        Rectangle measures=new Rectangle();
        measures.length=4;
        measures.breadth=5;
        System.out.println("The area is:"+measures.area());
        System.out.println("The parameter is:"+measures.parameter());

    }
}
