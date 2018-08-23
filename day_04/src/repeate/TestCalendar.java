package repeate;

import java.util.Calendar;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        int month = c.get(Calendar.MONTH);
        System.out.println(month+1);

        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int day = c.get(Calendar.DATE);
        System.out.println(day);

        c.add(1,2);

        System.out.println("=============");

        

    }
}
