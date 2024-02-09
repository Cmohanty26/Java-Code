import java.time.*;
public class day8 {
    public static void main(String[] args) {
        LocalTime t=LocalTime.of(15,20,30);
        System.out.println("The time before:"+t);
        LocalTime t1=t.minusMinutes(10);
        System.out.println("time after subracting 8 minutes:"+t1);
    }
}
