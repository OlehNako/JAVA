package academy.prog.extra.lesson04;

public class SimpleNumbers {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {

            int checkNumber = 0;

            for (int j = 2; j <= 100; j++) {
                if (i % j == 0) {
                    checkNumber++;
                }
            }

            if (checkNumber == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
