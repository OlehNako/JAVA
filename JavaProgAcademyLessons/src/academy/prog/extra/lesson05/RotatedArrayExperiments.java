package academy.prog.extra.lesson05;

import java.util.Arrays;
import java.util.Scanner;

public class RotatedArrayExperiments {
    public static void main(String[] args) {

        int[][] firstArr = {
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
        };

        for (int i = 0; i < 6; i++) {
            System.out.println(Arrays.toString(firstArr[i]));
        }

        System.out.println("На скільки крутонуть? (90, 180, 270)");
        Scanner rotateInput = new Scanner(System.in);
        int rotate = rotateInput.nextInt();

        switch (rotate){
            case 90:
                for(int i = 5; i>=0; i--){
                    firstArr[i][5]=firstArr[0][i];
                }
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 5; j++) {
                        firstArr[i][j]=firstArr[i][5];
                    }
                    System.out.println(Arrays.toString(firstArr[i]));
                }
                break;

            case 180:
                for(int i = 5; i>=0; i--){
                    firstArr[0][i]=firstArr[5][5-i];
                }
                for (int i = 1; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        firstArr[i][j]=firstArr[0][j];
                    }
                    System.out.println(Arrays.toString(firstArr[i]));
                }
                break;

            case 270:
                for(int i = 5; i>=0; i--){
                    firstArr[i][0]=firstArr[0][5-i];
                }

                for (int i = 0; i < 6; i++) {
                    for (int j = 1; j < 6; j++) {
                        firstArr[i][j]=firstArr[i][0];
                    }
                    System.out.println(Arrays.toString(firstArr[i]));
                }
                break;

            default:
                System.out.println("Непральна");
        }


    }
}
