package academy.prog.extra.lesson06methods;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNumberMethod {
    public static void main(String[] args) {
        System.out.println("Введіть масив цілих чисел через пробіл і натисніть ентер");
        Scanner userInp = new Scanner(System.in);
        String arrayString = userInp.nextLine();
        int[] randomArray = Arrays.stream(arrayString.split(" ")).mapToInt(Integer::parseInt).toArray();

        findMaxNumb(randomArray);
    }

    public static int findMaxNumb (int [] paramArr){
        int maxNumb = paramArr[0];
        for (int i = 1; i < paramArr.length; i++) {
            if (paramArr[i]>maxNumb){
                maxNumb=paramArr[i];
            }
        }
        System.out.println(maxNumb);
        return maxNumb;
    }
}
