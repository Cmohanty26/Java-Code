class MyEmployee{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n ){
        this.name=n;
    }
    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }
}
public class pratices65 {
    public static void main(String[] args) {
        MyEmployee harry=new MyEmployee();
        harry.setName("code with harry ");
        System.out.println(harry.getName());
        harry.setId(234);
        System.out.println(harry.getId());

    }
}
