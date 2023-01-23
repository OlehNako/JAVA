package academy.prog.extra.lesson07;

public class HowManyOnesBits {
    public static void main(String[] args) {
        System.out.println(onesCount(5));
        System.out.println(onesCount(7));
    }

    public static int onesCount(int a) {

        int count = 0;

        for (; a != 0; ) {

            if ((a & 1) > 0) {
                count++;
            }
            a = a >> 1;

        }


        return count;

    }
}
