public class Encapsulation {
    private double radius=10;
    private double getArea(){
        return radius*radius*Math.PI;
    }
    public static void main(String[] args) {
        Encapsulation circle=new Encapsulation();
        System.out.println("Radius is:"+circle.radius);
        System.out.println("Area of circle is:"+circle.getArea());

    }
}
