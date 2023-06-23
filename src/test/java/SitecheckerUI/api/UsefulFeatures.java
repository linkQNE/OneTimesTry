package SitecheckerUI.api;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class UsefulFeatures {

    public static String getCurrentDate(String format) {
        DateFormat dateFormat = new SimpleDateFormat(format);
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static int getDateAndMinusDays(int days) {
        LocalDate now = LocalDate.now();
        return now.minusDays(days).getDayOfMonth();
    }

    public static int getDayOfTheWeek() {
        Calendar calendar = Calendar.getInstance();
        calendar.getTime();


        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    public static int getCurrentDay() {
        Calendar calendar = new GregorianCalendar();
        Date date = new Date();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    public static int getCurrentHour() {
        Calendar calendar = new GregorianCalendar();
        Date date = new Date();
        calendar.setTime(date);
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    public static String getCurrentTime() {
        Date date = new Date();
        return (new SimpleDateFormat("HH:mm:ss").format(date));
    }

    public static long getTimestamp() {
        return System.currentTimeMillis();
    }
}
