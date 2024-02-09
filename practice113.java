import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class practice113 {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy---E a");
        String myDate= dt.format(df);
        System.out.println(myDate);

    }
}
