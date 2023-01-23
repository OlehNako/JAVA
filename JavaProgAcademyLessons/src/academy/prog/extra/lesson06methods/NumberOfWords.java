package academy.prog.extra.lesson06methods;

import java.util.Scanner;

public class NumberOfWords {
    public static void main(String[] args) {
        System.out.println("Введіть текст та натисніть ентер");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        numberOfWords(text);
    }

    public static int numberOfWords (String text){

        if (text == " " || text == ""){
            System.out.println("0");
            return 0;
        }

        String [] textArray = text.split(" ");
        int wordCount = textArray.length;

        System.out.println("Кількість слів в тексті: "+wordCount);
        return wordCount;
    }
}
