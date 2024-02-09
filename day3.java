class Mythread extends Thread {
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println("my cooking thread is running");
            System.out.println("i am happy");

            i++;
        }
    }
}
class Mythread2 extends Thread{
    @Override
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("thread 2 for chatting with her");
            System.out.println(" i am sad");
            i++;
        }
    }
}
public class day3 {
    public static void main(String[] args) {
        Mythread s1=new Mythread();
        Mythread s2=new Mythread();
        s1.start();
        s2.start();
    }
}
