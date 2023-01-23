package academy.prog.extra.lesson02;

import java.util.Scanner;

public class MotherInLow {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dist; //* расстояние
        float gasCoast = 27.5F; //* цена за 1л бензина
        float gasUsage = 9.8F; //* витрата літрів за 100км

        System.out.println("Введіть відстань та натисніть Enter");

        dist = sc.nextInt();

        float gasOverall = (gasUsage / 100.0F) * (dist * 2); //* витрата літрів за дистанцію туди-назад
        float money = gasOverall * gasCoast ;

        System.out.println(money + " UAH");

    }
}
