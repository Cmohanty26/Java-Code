class Thread1 extends Thread{
    public Thread1(String name){
        super(name);
    }
    public void run() {

        for (int i=0;i<=10;i++){
            System.out.println("thank you" + this.getName());
        }
    }
}
public class practice89 {
    public static void main(String[] args) {
Thread1 t1=new Thread1("Chandan Mohanty");
Thread1 t2=new Thread1("Haranababipatna");
Thread1 t3=new Thread1("Karanj");
Thread1 t4=new Thread1("Pratappur");
Thread1 t5=new Thread1("Odisha(most important)");
t5.setPriority(Thread.MAX_PRIORITY);
t4.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
t1.start();
t2.start();
t3.start();
t4.start();
t5.start();
    }
}
