package academy.prog.extra.lesson05;

import java.util.Arrays;

public class ArrayBeforeAndAfter {
    public static void main(String[] args) {

        int arrayOne [] = new int[15];
        int arrayTwo [] = new int[30];

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = (int) (1+Math.random()*10);
            arrayTwo[i] = arrayOne[i];
            arrayTwo[i+arrayOne.length] = arrayOne[i]*2;
        }

        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));



    }
}
