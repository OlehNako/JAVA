package academy.prog.extra.lesson04;

import java.util.Scanner;

public class RectangleStars {
    public static void main(String[] args) {

        Scanner scHeight = new Scanner(System.in);
        Scanner scWeight = new Scanner(System.in);
        int height = scHeight.nextInt();
        int weight = scWeight.nextInt();

        for (int i = 1; i <= height ; i++) {
            for (int j = 1; j <= weight ; j++) {

                if (i==1 | i==height | j ==1 | j==weight){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
