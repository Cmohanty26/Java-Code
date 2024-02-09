class Priority extends Thread{
    @Override
    public void run() {
        System.out.println("i'm thread: "+Thread.currentThread().getName());
        System.out.println("I'm Thread :"+Thread.currentThread().getPriority());
    }
}
public class practice97 {
    public static void main(String[] args) {
Priority t1=new Priority();
Priority t2=new Priority();
t1.setPriority(Thread.MIN_PRIORITY);
t2.setPriority(Thread.MAX_PRIORITY);
t1.start();
t2.start();
    }
}
