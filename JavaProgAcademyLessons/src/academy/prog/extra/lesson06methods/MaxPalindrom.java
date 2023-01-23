package academy.prog.extra.lesson06methods;

import java.util.Arrays;

public class MaxPalindrom {
    public static void main(String[] args) {

        int maxPalindrom = 0;
        for (int i = 999; i >=100 ; i--) {
            for (int j = 999; j >=100 ; j--) {
                int checkNumber = i*j;
                if ( (isItPalindrom(checkNumber) == 1) && (checkNumber > maxPalindrom) ){
                    maxPalindrom = checkNumber;
                }
            }
        }
        if (maxPalindrom==0){
            System.out.println("Error");
        }else {
            System.out.println(maxPalindrom + " - самое большое число-палиндром из умножения трехзначньіх чисел");
        }
    }

    public static int isItPalindrom (int a){

        int[] checkArray = Integer.toString(a).chars().map(c -> c-'0').toArray();
        for (int i = 0; i <= checkArray.length/2-1; i++) {
            if (checkArray[i]!= checkArray[checkArray.length-1-i] ){
                return 0;
            }
        }
        return 1;
    }
}
