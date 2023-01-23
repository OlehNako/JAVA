package academy.prog.extra.lesson07;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HBDJava {
    public static void main(String[] args) {

// 23 may 1995

        Calendar cl = Calendar.getInstance();
        cl.set(Calendar.YEAR, 1995);
        cl.set(Calendar.MONTH, Calendar.MAY);
        cl.set(Calendar.DAY_OF_MONTH, 23);

        int day = cl.get(Calendar.DAY_OF_WEEK);
        System.out.println(day);

        Date date = cl.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        System.out.println(sdf.format(date));


    }
}
