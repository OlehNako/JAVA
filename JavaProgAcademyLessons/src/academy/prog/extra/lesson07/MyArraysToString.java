package academy.prog.extra.lesson07;

public class MyArraysToString {
    public static void main(String[] args) {
        int[] example = {1, 2, 3, 4};
        System.out.println(myMethod(example));
    }
    public static String myMethod (int [] a){

        StringBuilder sb = new StringBuilder("[ ");
        sb.append(a[0]);
        for (int i = 1; i < a.length; i++) {
            sb.append(", " + a[i]);
        }
        sb.append(" ]");
        return sb.toString();
    }
}
