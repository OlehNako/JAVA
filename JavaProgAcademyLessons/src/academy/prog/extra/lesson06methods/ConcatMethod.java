package academy.prog.extra.lesson06methods;

import java.util.Scanner;

public class ConcatMethod {
    public static void main(String[] args) {

        System.out.println("Введите целое число и нажмите ентер");
        Scanner userIntInput = new Scanner(System.in);
        int userInt = userIntInput.nextInt();

        System.out.println("Введите дробное число и нажмите ентер");
        Scanner userDoubleInput = new Scanner(System.in);
        double userDouble = userDoubleInput.nextDouble();

        System.out.println("Введите строку текста и нажмите ентер");
        Scanner userStringInput = new Scanner(System.in);
        String userString = userStringInput.nextLine();

        concatMethod(userInt, userDouble, userString);

    }

    public static String concatMethod (int intNumb, double doubleNumb, String text){
        String result = intNumb + doubleNumb +text;
        System.out.println(result);
        return result;

    }
}
