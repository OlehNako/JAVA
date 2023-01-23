package academy.prog.extra.lesson05;

import java.util.Scanner;

public class HowManyBDoYouHave {
    public static void main(String[] args) {

        Scanner inputText = new Scanner(System.in);
        String text = inputText.nextLine();
        char[] charsArray = text.toCharArray();
        int bCounter = 0;



        for (int chars : charsArray) {
            if (chars == 'b') {

                bCounter++;
            }
        }
        System.out.println(bCounter);
    }
}
