
class AA{
    void m1(AA a){
        System.out.println("m1 method in class AA");
    }
}
class BB extends AA{
    public void m1(AA a){
        System.out.println("m1 method in class BB");
    }

}
public class Test {
    public static void main(String[] args) {
        AA a=new AA();
        a.m1(a);
        a.m1(new BB());
        BB b=new BB();
        b.m1(null);
        a=b;
        a.m1(null);
        a.m1(new AA());

    }
}
