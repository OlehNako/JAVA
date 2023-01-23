package academy.prog.extra.lesson06methods;

public class FindLetters {
    public static void main(String[] args) {
        String text = "Hello";
        char letter = 'l';
        System.out.println(numberOfLetters(text, letter));

    }

    public static int numberOfLetters (String text, char letter){
        int counter = 0;

        char [] textArray = text.toCharArray();
        for (char textElement:
             textArray) {
            if (textElement == letter){
                counter++;
            }
        }

        return counter;
    }
}
