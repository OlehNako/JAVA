package academy.prog.extra.lesson04;

import java.util.Scanner;

public class Wallpapers {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int listsNumber = userInput.nextInt();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= listsNumber; j++) {

                if (j % 2 == 0) {
                    System.out.print("+++");
                } else {
                    System.out.print("***");
                }

            }
            System.out.println();
        }
    }
}
