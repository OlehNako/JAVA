package academy.prog.extra.lesson05;

import java.util.Arrays;
import java.util.Scanner;

public class IntArrayWithMyNumbers {
    public static void main(String[] args) {

        Scanner inputSize = new Scanner(System.in);
        int arraySize = inputSize.nextInt();
        int array [] = new int[arraySize];

        for(int i = 0; i < array.length; i++){
            Scanner inputElement = new Scanner(System.in);
            array[i] = inputElement.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }

}
