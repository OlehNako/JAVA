package academy.prog.extra.lesson07;

public class SorryManFiveTen {
    public static void main(String[] args) {

        for (int i = 2; i < 12; i++) {
            System.out.println(variantsOfPi(Math.PI, i));
        }
    }

    public static String variantsOfPi (double value, int n){

        String text = String.format("PI = %."+n+"f", value);
        return text;
    }
}
