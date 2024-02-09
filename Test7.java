class Employeed{
    int id;
    Employeed(int id){
        this.id=id;
    }
}
class Check{
    void swap(Employeed obj1,Employeed obj2){
        Employeed temp;
        temp=obj1;
        obj1=obj2;
        obj2=temp;
    }
}
public class Test7 {
    public static void main(String[] args) {
        Employeed obj1=new Employeed(10);
        Employeed obj2=new Employeed(20);
        Check obj=new Check();
        System.out.println(obj1.id+"\t"+ obj2.id);
        obj.swap(obj1,obj2);
        System.out.println(obj1.id+"\t"+ obj2.id);
    }
}
