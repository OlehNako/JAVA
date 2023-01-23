package academy.prog.extra.lesson06methods;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchElements {
    public static void main(String[] args) {
        System.out.println("Введіть масив цілих чисел через пробіл і натисніть ентер");
        Scanner userInp = new Scanner(System.in);
        String arrayString = userInp.nextLine();
        int[] randomArray = Arrays.stream(arrayString.split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println("Введіть елемент для пошуку");
        Scanner scFind = new Scanner(System.in);
        int searchElement = scFind.nextInt();

        findElement(randomArray, searchElement);
    }

    public static int findElement (int[] arr, int element) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == element) {
                System.out.println(i);
                return i;
            }
        }
        System.out.println("-1");
        return -1;
    }

    }


