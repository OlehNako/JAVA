package academy.prog.extra.lesson07;

import java.util.Arrays;
import java.util.Scanner;

public class HammingDistance {
    public static void main(String[] args) {

        System.out.println("Введите N");
        Scanner scN = new Scanner(System.in);
        int n = scN.nextInt();
        System.out.println("Введите M");
        Scanner scM = new Scanner(System.in);
        int m = scM.nextInt();

        System.out.println(hemmingDistance(n, m));
    }

    public static int hemmingDistance(int n, int m) {

        String nBinary = Integer.toBinaryString(n);
        String mBinary = Integer.toBinaryString(m);
        int[] nArray = Arrays.stream(nBinary.split("")).mapToInt(Integer::parseInt).toArray();
        int[] mArray = Arrays.stream(mBinary.split("")).mapToInt(Integer::parseInt).toArray();
        int[] nTrueArray = new int[31];
        int[] mTrueArray = new int[31];
        System.arraycopy(nArray, 0, nTrueArray, 31-nArray.length, nArray.length);
        System.arraycopy(mArray, 0, mTrueArray, 31-mArray.length, mArray.length);

        int distanceCounter = 0;
        for (int i = 30 ; i >= 0; i--) {
            if (nTrueArray[i]!=mTrueArray[i]){
                distanceCounter++;
            }
        }

        return distanceCounter;
    }
}
