class mohanty{
    public int x=5;
    protected int y=20;
    int z=8;//default
    private int a=90;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}


public class day1 {
    public static void main(String[] args) {
        mohanty d=new mohanty();
        System.out.println(d.x);
        System.out.println(d.y);
        System.out.println(d.z);

    }
}
