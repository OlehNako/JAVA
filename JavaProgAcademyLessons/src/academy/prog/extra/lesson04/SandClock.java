package academy.prog.extra.lesson04;

import java.util.Scanner;

public class SandClock {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int maxWeight = userInput.nextInt();

        if (maxWeight % 2 == 0) {
            System.out.println("Wrong number");
        } else {

            for (int i = 1; i <= maxWeight; i++) {
                for (int j = 1; j <= maxWeight; j++) {

                    if (i <= maxWeight / 2 + 1) {
                        if (i > j || i > (maxWeight - j + 1)) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    } else {
                        if (i < j || i < (maxWeight - j + 1)) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
