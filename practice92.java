import java.util.ArrayList;

class Thread5 extends Thread{
    public void run(){
        try {
            Thread.sleep(200);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
       for (int i=0;i<=10;i++){
            System.out.println("Welcome");
        }
    }
}
class Chandan extends Thread {
    public void run() {
        for (int i=0;i<=10;i++){
            System.out.println("Good morning");
        }
    }
}
public class practice92 {
    public static void main(String[] args) {
        Thread5 t1= new Thread5();
        Chandan t2= new Chandan();
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread().getState());
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());
        t1.start();
        t2.start();
    }
}
