class person{
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
    public class Test6 {
    public static void main(String[] args) {
        person p1=new person();
        p1.setName("Raju");
        p1.setAge(20);
        System.out.println("Name="+p1.getName());
        System.out.println("Age="+p1.getAge());

    }
}
