package academy.prog.extra.lesson06methods;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class RawOfNumbers {
    public static void main(String[] args) {
        System.out.println("Введите последовательность чисел через пробел и нажмите ентер");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        int[] userArray = Arrays.stream(userInput.split(" ")).mapToInt(Integer::parseInt).toArray();

        if (userArray.length>3){
            theNextNumbers(userArray);
        } else {
            System.out.println("Маловато чисел будет. Перезапускай");
        }
    }

    public static void theNextNumbers (int[]arr){

        double userPow = Math.log(arr[1])/Math.log(2);

        if( (arr[2]==Math.pow(3, userPow) && arr[arr.length-1]==Math.pow(arr.length, userPow)) ){
            System.out.println((int)Math.pow(arr.length+1, userPow));
        }
        else if ( (arr[1]-arr[0]==arr[2]-arr[1]) && (arr[arr.length-2]-arr[arr.length-3] == arr[arr.length-1]-arr[arr.length-2]) ){
            int p = arr[1] - arr[0];
            System.out.println(arr[arr.length-1]+p);
        }
        else if ( (arr[1]/arr[0]==arr[2]/arr[1]) && (arr[arr.length-2]/arr[arr.length-3] == arr[arr.length-1]/arr[arr.length-2]) ){
            int p = arr[1]/arr[0];
            System.out.println(arr[arr.length-1]*p);
        }
        else {
            System.out.println("Нипральна. Перезапускай");
        }
    }
}
