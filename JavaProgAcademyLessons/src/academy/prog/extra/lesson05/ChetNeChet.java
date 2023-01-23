package academy.prog.extra.lesson05;

public class ChetNeChet {
    public static void main(String[] args) {

        int array [] = {0,5,2,4,7,1,3,19};
        int counter = 0;

        for (int number : array) {
            if (number%2 != 0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
