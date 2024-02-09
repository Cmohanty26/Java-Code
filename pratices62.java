class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
    public void run(){
        System.out.println("Running on the enemy");
    }
}
public class pratices62 {
    public static void main(String[] args) {
        Tommy players=new Tommy();
        players.fire();
        players.hit();
        players.run();

    }
}
