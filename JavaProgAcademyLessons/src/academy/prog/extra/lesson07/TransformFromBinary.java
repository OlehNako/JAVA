package academy.prog.extra.lesson07;

import java.util.Arrays;
import java.util.Scanner;

public class TransformFromBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryNumb = sc.nextLine();
        int[] binaryArray = Arrays.stream(binaryNumb.split("")).mapToInt(Integer::parseInt).toArray();

        int result = 0;
        for (int i = binaryArray.length-1; i >= 0; i--) {
            if (binaryArray[i]==1){
                result = result + (1<<i) ;
            }
        }
        System.out.println(result);
    }
}
