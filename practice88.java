interface Sample{
    void meth1();
    void meth2();
}
interface childSample extends Sample{
    void meth3();
    void meth4();

}
class MyClass implements childSample{
    @Override
    public void meth1() {
        System.out.println("meth1");
    }

    @Override
    public void meth2() {
        System.out.println("meth2");
    }

    @Override
    public void meth3() {
        System.out.println("meth3");
    }

    @Override
    public void meth4() {
        System.out.println("meth4");
    }
}
public class practice88 {
    public static void main(String[] args) {
        MyClass sc=new MyClass();
        sc.meth1();
        sc.meth2();
        sc.meth3();
        sc.meth4();
    }
}
