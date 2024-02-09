class sample{
    //method to add values
    void add(int a,int b){
        System.out.println("sum of two="+(a+b));

    }
    //method to add three values
    void add(int a,int b,int c){
        System.out.println("sum of three="+(a+b+c));
    }

}
public class Day14 {
    public static void main(String[] args) {
        //create sample class object
        sample s=new sample();
        s.add(10,15);
        s.add(10,15,20);
    }
}
