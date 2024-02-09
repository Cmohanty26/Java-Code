import java.util.Scanner;

class Rectangle2{
    private int length;
    private int breadth;
    private int height;
    public Rectangle2(int length,int breadth,int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public int getHeight(){
        return height;
    }
    public double SurfaceArea(){
        return length*breadth;
    }
    public double Volume(){
        return length*breadth*height;
    }


}
public class practice72 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of a rectangle:");
        int l= sc.nextInt();
        System.out.println("Enter the breadth of a rectangle:");
        int b= sc.nextInt();
        System.out.println("Enter the height of a rectangle:");
        int h=sc.nextInt();
        Rectangle2 rec=new Rectangle2(l,b,h);
        System.out.println("Enter the SurfaceArea of a rectangle is:"+rec.SurfaceArea());
        System.out.println("Enter the Volume of a rectangle is:"+rec.Volume());

    }
}
