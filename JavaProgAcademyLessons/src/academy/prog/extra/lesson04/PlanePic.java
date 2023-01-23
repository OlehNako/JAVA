package academy.prog.extra.lesson04;

import java.util.Scanner;

public class PlanePic {
    public static void main(String[] args) {

        Scanner userNumber = new Scanner(System.in);
        int number = userNumber.nextInt();
        String stroke = "";


        for (int i = 1; i <= number * 2 - 1; i++) {

            if (i <= number) {

                stroke += "*";

            } else {
                stroke = stroke.substring(0, stroke.length() - 1);
            }
            System.out.println(stroke);
        }


    }
}
