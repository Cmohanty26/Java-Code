//constructor overloading in java
class employee{
    employee(String s,int i){
        System.out.println("The name of the 1st employee is:"+ s);
        System.out.println("The id of the 1st employee is:"+ i);
    }
    employee(String s,int i,int salary){
        System.out.println("The name of the 2st employee is:"+ s);
        System.out.println("The id of the 2st employee is:"+ i);
        System.out.println("The salary of the 2nd employee is:"+ salary);
    }

}
public class pratices67 {
    public static void main(String[] args) {
    employee p1=new employee("chandan",5);
    employee p2=new employee("Mohanty",8,2400);
    }
}
