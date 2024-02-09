class Brand{
    public int length;
    public int breadth;
    Brand(int i, int i1, int i2){
        System.out.println("i am default constructor of rectangle");
    }
    Brand(int length,int breadth){
        System.out.println("i am parameterised constructor of rectangle");
        this.length=length;
        this.breadth=breadth;
    }
    public void setLength(int length){
        this.length=length;
    }

    public int getLength() {
        return length;
    }
    public void setBreadth(int breadth){
        this.breadth=breadth;
    }
    public int getBreadth(){
        return breadth;
    }
    public int area(){
        return length*breadth;
    }
}
class Cuboid extends Brand{
    public int height;
    Cuboid(int length,int breadth,int height){
        super(length,breadth);
        System.out.println("i am parameterized constructor of cuboid");
    }
    public void setHeight(int height){
        this.height=height;
    }
    public int getHeight(){
        return height;
    }
    public int Boubder(){
        return 2*length*breadth+2*breadth*height+2*length*height;
    }
}
public class PRACTICE84 {
    public static void main(String[] args) {
        Cuboid cd=new Cuboid(4,7,8);
       // Cuboid cd=new Brand(6,7,9);
cd.setLength(4);
cd.setBreadth(7);
cd.setHeight(8);
        System.out.println(cd.getLength());
        System.out.println(cd.getBreadth());
        System.out.println(cd.getHeight());
        System.out.println("The surfacearea of rectangle is:"+cd.Boubder());
        System.out.println("The area of rectangle is:"+cd.area());

    }
}
