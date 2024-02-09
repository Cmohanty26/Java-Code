class phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on phone");
    }
}
class Smartphone extends phone{
    public void music(){
        System.out.println("playing music");
    }
    public void on(){
        System.out.println("Turning on smartphone...");
    }
}
public class practice81 {
    public static void main(String[] args) {
      phone obj=new Smartphone();
      obj.on();
      obj.showTime();
    }
}
