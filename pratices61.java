class Circle{
    float radius;
    public float area(){
        return 3.14f*radius*radius;
    }
    public float parameter(){
        return 2*3.14f*radius;
    }
}
public class pratices61 {
    public static void main(String[] args) {
        Circle cir=new Circle();
        cir.radius=3.0f;
        System.out.println("The area of circle is:"+cir.area());
        System.out.println("The area of parameter is:"+cir.parameter());
    }
}
