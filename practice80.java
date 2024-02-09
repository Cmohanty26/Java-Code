class C{
    public int c;
    public int chandan(){
        return 4;
    }
    public void meth2(){
        System.out.println("i am method2 of class C");
    }
}
class D extends C{
    @Override
    public void meth2(){
        System.out.println("i am method2 of class D");

    }
    public void meth3(){
        System.out.println("i am method3 of class D");
    }
}
public class practice80 {
    public static void main(String[] args) {
     C c=new C();
     c.meth2();
     D d=new D();
     d.meth2();

    }
}
