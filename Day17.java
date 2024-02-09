class Commercial{
    private String name;
    //store customer name into name
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    //to calculated bill taking rs 5.00 per unit
    void calculateBill(int units){
        System.out.println("customer: "+getName());
        System.out.println("Bill amount= "+ units*5.00);
    }
}
class Domestic extends Commercial{
    void  calculateBill(int units){
        System.out.println("Customer: "+  getName());
        System.out.println("Bill amount= "+ units*2.50);
    }
}
public class Day17 {
    public static void main(String[] args) {
        Commercial c=new Commercial();
        c.setName("Chandan Mohanty");
        c.calculateBill(1000);
        Domestic d=new Domestic();
        d.setName("Kamalini mohanty");
        d.calculateBill(100);
    }
}
