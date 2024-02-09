import java.util.*;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
       ArrayList<Integer> E1=new ArrayList<>();
       E1.add(7);
       E1.add(9);
       E1.add(10);
        E1.add(2,90);
        E1.add(0,5);
        System.out.println(E1.contains(100));
       // for (int i=0;i<=E1.size();i++){
       //     System.out.println(E1.get(i));
        //}
    }
}
