import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class practice109 {
    public static void main(String[] args) {
        //System.out.println(System.currentTimeMillis()/2022/3600/24/365);
        Date d=new Date();
        System.out.println(d);
        //System.out.println(d.getYear());
        int year=d.getYear();
        int currentYear= year+1900;
        System.out.println("current year is:"+currentYear);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
       /* Calendar c= Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+Calendar.MINUTE+":"+Calendar.SECOND);
        GregorianCalendar cal=new GregorianCalendar();
        System.out.println(cal.isLeapYear(2000));*/
        LocalDate e=LocalDate.now();
        System.out.println(e);
        LocalTime t=LocalTime.now();
        System.out.println(t);
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
    }
}
