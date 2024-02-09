//overriding method in java
class A{
   public void meth1(){
       System.out.println("i am method of class A");
   }
}
class B extends A{
    @Override
    public void meth1(){
        System.out.println("i am method1 of class B");
    }

}
public class practice79 {
    public static void main(String[] args) {
        A a=new A();
        a.meth1();
        B b=new B();
        b.meth1();

    }
}
