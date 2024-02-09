class base{
    base(){
        System.out.println("i am a constructor");
    }
    base(int x){
        System.out.println("i am an overloaded constructor with the value of x:"+x);
    }
}
class Derived extends base{
    Derived(){
        System.out.println("i am derived class constructor");
    }
    Derived(int x,int y){
        super(x);
        System.out.println("i am an overloaded constructor with the value of y:"+y);
    }
}
class childoFDerived extends Derived{
    childoFDerived(){
        System.out.println("i am child of derived constructor");
    }
    childoFDerived(int x,int y,int z){
        super(x,y);
        System.out.println("i am an overloaded constructor of derived with value of z:"+z);
    }
}
public class practice76 {
    public static void main(String[] args) {
childoFDerived cd=new childoFDerived(12,23,45);
    }
}
