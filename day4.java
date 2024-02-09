class p1 implements Runnable{
@Override
    public void run(){
    System.out.println("Thread is running");
}
}
public class day4 {
    public static void main(String[] args) {
        p1 obj=new p1();
        Thread p1=new Thread(obj);
        p1.start();


    }
}
