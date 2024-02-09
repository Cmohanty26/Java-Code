import java.util.Scanner;

class Sphere{
    private int radius;
    public Sphere(int radius){
        this.radius=radius;

    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public double SurfaceArea(){
        return  4*Math.PI*radius*radius;
    }
    public double Volume(){
        return (4.0/3.0)*Math.PI*radius*radius*radius;

    }
}
public class practice71 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of Sphere:");
        int r= sc.nextInt();
        Sphere s=new Sphere(r);
        System.out.println("Enter the SurfaceArea of a sphere:"+ s.SurfaceArea());
        System.out.println("Enter the Volume of a Sphere:"+s.Volume());

    }
}
