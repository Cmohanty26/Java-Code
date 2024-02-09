//public class pratices57 {
    class Employee1{
       int salary;
       String name;
       public int getSalary(){
           return salary;
       }
       public String getName(){
           return name;
       }
       public void setName(String n){
           name=n;
       }


    public static void main(String[] args) {
        Employee1 harry=new Employee1();
        harry.setName("chandan mohanty");
        harry.salary=789;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());
    }
}
