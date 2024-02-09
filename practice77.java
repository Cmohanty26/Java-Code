class day{
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
    //day(int x){
        //this.x=x;
        x=x;
    }
}
public class practice77 {
    public static void main(String[] args) {
        day d=new day();
        d.setX(70);
        System.out.println(d.getX());

    }
}
