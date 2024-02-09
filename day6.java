import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class day6 {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        System.out.println("The current date is:"+dt);
        DateTimeFormatter df=DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter dd=DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String myTime=dt.format(dd);
        System.out.println("Date time in iso format:"+myTime);
        String myDate= dt.format(df);
        System.out.println("Date in iso format:"+myDate);
    }
}
