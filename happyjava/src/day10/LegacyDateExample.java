package day10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LegacyDateExample {
    public static void printCalendar(int year, int month){
        //사용자로부터 연도와 월을 입력 받으면 해당 달의 달력을 출력 하는 메소드.
    }
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd h:mm a");
        System.out.println(sdf.format(now));

        Calendar calendar =  Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH)+1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));


//        System.out.printf("오늘: %d년 %d월 %d일%n", year, month, day);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2026, 6, 1);

        System.out.println(calendar2.get(Calendar.MONTH)+1);
        System.out.println(calendar2.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar2.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}
