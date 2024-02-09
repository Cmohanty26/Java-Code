class day9 extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Good Morning");
        }
    }
}
class day10 extends Thread{
    @Override
    public void run() {
       while (true){
           try {
               Thread.sleep(200);
           }
           catch (Exception e){
               System.out.println(e);
           }
           System.out.println("Welcome");

       }
    }
}
public class practice105 {
    public static void main(String[] args) {
        day9 d1=new day9();
        day10 d2=new day10();
        System.out.println(d1.getPriority());
        System.out.println(d2.getPriority());
        System.out.println(d2.getState());
        d2.start();
        System.out.println(d2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
