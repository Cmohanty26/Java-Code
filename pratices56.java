//public class pratices56 {
    class Employee{
        int id;
        int salary;
        String name;
        public void printDetails(){
            System.out.println("my id is:"+id);
            System.out.println("and my name is:"+name);
        }
        public int getSalary(){
            return salary;
        }


    public static void main(String[] args) {
        System.out.println("this is our custom class:");
        Employee harry=new Employee();
        Employee chandan=new Employee();
        //setting the attributes for harry
        harry.id=12;
        harry.salary=34;
        harry.name="chandan mohanty";
        //setting the attributes for chandan
        chandan.id=17;
        chandan.salary=12;
        chandan.name="Anjan das";
        harry.printDetails();
        chandan.printDetails();
        int salary= chandan.getSalary();
        System.out.println(salary);
    }
}
