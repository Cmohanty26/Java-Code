class circle {
    public int radius;

    circle() {
        System.out.println("i am a non param of circle");
    }

    circle(int r) {
        System.out.println("i am a circle parameterized constructor");
        this.radius = r;
    }

    public double area8() {
        return Math.PI * this.radius * this.radius;
    }
}
    class Cylinder9 extends circle {
        public int height;

        Cylinder9(int r, int h) {


            super(r);
            System.out.println("i am a cylinder parameterized constructor");
            this.height = h;
        }

        public double volume7() {
            return Math.PI * this.radius * this.radius * this.height;
        }
    }

public class practice83 {
    public static void main(String[] args) {
    Cylinder9 m=new Cylinder9(12,4)  ;
    }
}
