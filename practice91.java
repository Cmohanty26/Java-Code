import java.util.ArrayList;
class Monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
    interface BasicAnimal{
        void eat();
        void sleep();
    }
    class HUMAN extends Monkey implements BasicAnimal{

        void speak(){
            System.out.println("Hello sir !");
        }
        @Override
        public void eat() {
            System.out.println("Eating");
        }

        @Override
        public void sleep() {
            System.out.println("Sleeping...");
        }
    }
}
public class practice91 {
    public static void main(String[] args) {


    }
}
