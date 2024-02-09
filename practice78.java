import java.util.Scanner;
class EkClass{
    int a;
    public int getA(){
        return a;
    }
    EkClass(int a){
        this.a=a;
    }
    public int returnOne(){
        return 1;
    }

}
class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("i am a constructor");
    }
}
public class practice78 {
    public static void main(String[] args) {
        EkClass e=new EkClass(70);
        DoClass d=new DoClass(89);
        System.out.println(e.getA());
    }
}
