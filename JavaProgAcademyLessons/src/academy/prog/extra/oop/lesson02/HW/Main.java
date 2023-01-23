package academy.prog.extra.oop.lesson02.HW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Як звуть вашого песика?");
        Scanner scName = new Scanner(System.in);
        String userName = scName.nextLine();

        System.out.println("Якого кольору ваш песик?");
        Scanner scColor = new Scanner(System.in);
        String userColor = scColor.nextLine();

        System.out.println("Скільки кг важить ваш песик? (цифра)");
        Scanner scWeight = new Scanner(System.in);
        int userWeight = scWeight.nextInt();

        System.out.println("Що кушає ваш песик?");
        Scanner scRation = new Scanner(System.in);
        String userRation = scRation.nextLine();

        Veterinarian veterinarian = new Veterinarian("Oleh");
        Cat cat = new Cat("рибку", "чорного", 4, "Чіпсік");
        Dog dog = new Dog("м'ясо", "білого", 6, "Кнопа");
        Dog dog2 = new Dog(userRation, userColor, userWeight, userName);
        Animal an1 = cat;
        Animal an2 = dog;
        Animal an3 = dog2;

        veterinarian.treatment(an1);
        veterinarian.treatment(an2);
        veterinarian.treatment(an3);
    }
}
