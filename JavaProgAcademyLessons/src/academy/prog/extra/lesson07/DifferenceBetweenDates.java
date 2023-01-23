package academy.prog.extra.lesson07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DifferenceBetweenDates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userData = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy");
        Date date = new Date();
        Date dateNow = new Date();

        try {
            date = sdf.parse(userData);
        } catch (ParseException e) {
            System.err.println("Непральна");
            e.printStackTrace();
        }

        int monthDifference = Math.abs(date.getMonth()-dateNow.getMonth());
        int yearDifference = Math.abs(date.getYear()-dateNow.getYear());

        if (monthDifference!=0){
            System.out.println("Разница в месяцах: " + monthDifference);
        }
        if (yearDifference!=0){
            System.out.println("Разница в годах: " + yearDifference);
        }
        if (monthDifference==0 && yearDifference==0){
            System.out.println("Єто тот же год и тот же месяц");
        }

    }
}
