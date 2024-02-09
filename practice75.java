class Base{
    public int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("i am in base and setting x now");
        this.x=x;
    }
    public void printMe(){
        System.out.println("i am a constructor");
    }
}
class derived extends Base{
    public int y;
    public int getY(){
        return y;
    }

    public void setY(int y) {
        System.out.println("i am in derived and setting y now");
        this.y = y;
    }
}
public class practice75 {
    public static void main(String[] args) {
        Base b=new Base();
        b.setX(67);
        System.out.println(b.getX());
        derived d=new derived();
        d.setY(90);
        System.out.println(d.getY());

    }
}
