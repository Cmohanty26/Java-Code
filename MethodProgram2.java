public class MethodProgram2 {
    public static void main(String[] args) {
        int length,breath;
        length=10;
        breath=5;
        double height=2.5;
        double sq_area,rect_area,tri_area;
        sq_area=area(length);
        rect_area=area(length,breath);
        tri_area=area(breath,height);
        System.out.println("The area of square is:"+sq_area);
        System.out.println("The area of rectangle is:"+rect_area);
        System.out.println("The area of triangle is:"+tri_area);
    }
    public static double area(int length) {
        double area = length * length;
        return area;
    }
    public static double area(int length,int breath) {
        double area = length * breath;
        return area;
    }
    public static double area(int breath,double height) {
        double area =0.5*breath * height;
        return area;
    }



    }

