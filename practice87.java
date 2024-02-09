class Circle87{
    public int radius;
    Circle87(){
        System.out.println("i am non param of circle");
    }
    Circle87(int r){
        System.out.println("i am circle parameterized construction ");
        this.radius=r;
    }
    public double BArea(){
        return Math.PI*this.radius*this.radius;
    }

}
class Cylinder87 extends Circle87{
  public int height;
  Cylinder87(int r,int h){
      super(r);
      System.out.println("i am a cylinder parameterized constructor");
      this.height=h;
  }
  public double Volume87(){
      return Math.PI*this.radius*this.height;
  }

}
public class practice87 {
    public static void main(String[] args) {
        Cylinder87 obj=new Cylinder87(12,4);
        System.out.println("The area of circle is:"+(obj.BArea()));
        System.out.println("The volume of circle is:"+(obj.Volume87()));

    }
}
