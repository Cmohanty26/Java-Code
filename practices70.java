import java.util.Scanner;

class Cylinder{
    private int radius;
    private int height;
    public Cylinder(int radius,int height){
       //use constructor
        this.radius=radius;
        this.height=height;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public double surfaceArea(){
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
public class practices70 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of a cylinder:");
        int radius= sc.nextInt();
        System.out.println("Enter the height of a cylinder:");
        int height= sc.nextInt();
        Cylinder myCylinder=new Cylinder(radius,height);

        System.out.println("The surface area of cylinder is:"+myCylinder.surfaceArea());
        System.out.println("The volume of cylinder is:"+myCylinder.volume());

    }
}
