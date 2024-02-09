class One{
    //method to calculate square value
    void calculated(double x){
        System.out.println("Square value ="+(x*x));
    }
}
class Two extends One{
    //method to calculate square root value
    void calculated(double x){
        System.out.println("Square root ="+Math.sqrt(x));
    }

}
public class Day15 {
    public static void main(String[] args) {


    //create sub class object
    Two t=new Two();
    t.calculated(25);

}
}
