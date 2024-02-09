import java.io.*;
import java.lang.Thread;
public class practice96 {
    public static void main(String[] args) {
try {
    for (int i=1;i<=10;i++){
        Thread.sleep(200);
        System.out.println(i);
    }

}
catch (Exception e){
    System.out.println(e);
}
    }
}
