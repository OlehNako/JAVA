package academy.prog.extra.lesson07;

import java.util.Calendar;
import java.util.Date;

public class BackInTimeJavaEdition {
    public static void main(String[] args) {

        Calendar clNow = Calendar.getInstance();
        Calendar clBefore = Calendar.getInstance();

        clBefore.set(Calendar.YEAR, 2022);
        clBefore.set(Calendar.MONTH, Calendar.DECEMBER);

        Date dateNow = clNow.getTime();
        Date dateBefore = clBefore.getTime();

        long distance = dateNow.getTime()-dateBefore.getTime();

        System.out.println(distance);

    }
}
