package academy.prog.extra.lesson06methods;

import java.util.Scanner;

public class RectangleStarsMethod {
    public static void main(String[] args) {
        System.out.println("Введите вьісоту");
        Scanner scHeight = new Scanner(System.in);
        int height = scHeight.nextInt();
        System.out.println("Введите ширину");
        Scanner scWeight = new Scanner(System.in);
        int weight = scWeight.nextInt();

        drawing(height, weight);
    }

    public static void drawing (int height, int weight){
        for (int i = 1; i <= height ; i++) {
            for (int j = 1; j <= weight ; j++) {

                if (i==1 | i==height | j ==1 | j==weight){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
