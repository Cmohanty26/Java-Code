import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class day5 {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        System.out.println("The current date is:"+dt);
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String myDate= dt.format(df);
        System.out.println("Date after formatting:"+myDate);
    }
}
