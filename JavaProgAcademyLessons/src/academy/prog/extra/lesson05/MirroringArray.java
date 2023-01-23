package academy.prog.extra.lesson05;

import java.util.Arrays;
import java.util.Scanner;

public class MirroringArray {
    public static void main(String[] args) {
//        int [] randomArray = {7, 2, 1, 9, 4};
        System.out.println("Введіть числа через пробіл та натисніть ентер");
        Scanner userInput = new Scanner(System.in);
        String userNumbers = userInput.nextLine();
        int[] randomArray = Arrays.stream(userNumbers.split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < (int)(randomArray.length/2); i++) {
                    int safeNumb = randomArray[i];
                    int reverseIndex = (i+randomArray.length-1) - (i*2);
                    randomArray[i]=randomArray[reverseIndex];
                    randomArray[reverseIndex] = safeNumb;
                }

        System.out.println(Arrays.toString(randomArray));

    }
}
