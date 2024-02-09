class Multi extends Thread{
    public void run(){
        System.out.println("thread is running..");
    }

}
public class day2 {
    public static void main(String[] args) {
        Multi fun1=new Multi();
        fun1.start();
        Multi fun2=new Multi();
        fun2.start();
    }
}
