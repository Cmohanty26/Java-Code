import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class day7 {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        System.out.println("The current date is:"+d);
        LocalTime t=LocalTime.now();
        System.out.println("The current time is:"+t);
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

    }
}
