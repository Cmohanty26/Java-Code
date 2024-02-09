class jay extends Thread{
    public void run(){
        while (true){
            System.out.println("Welcome");
        }
    }
}
class jagannath  extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Good morning");
        }
    }
}
public class practice106 {
    public static void main(String[] args) {
        jay j1=new jay();
        jagannath j2=new jagannath();
        j1.start();
        j2.start();
    }
}
