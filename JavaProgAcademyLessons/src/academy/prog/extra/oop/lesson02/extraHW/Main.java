package academy.prog.extra.oop.lesson02.extraHW;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите название файла для сохранения текста и нажмите ентер");
        Scanner scFile = new Scanner(System.in);
        String userFile = scFile.nextLine();
        File fileName = new File(userFile + ".txt");
        try {
            if (fileName.createNewFile()) {
                System.out.println("Файл создан");
            } else {
                System.out.println("Файл уже существует");
            }
        } catch (Exception e){
            System.err.println(e);
        }

        System.out.println("Введите текст для трансформации и нажмите ентер");
        Scanner scText = new Scanner(System.in);
        String userText = scText.nextLine();

        System.out.println("Введите номер нужной трансформации и нажмите ентер:");
        System.out.println("1 - перевести текст в верхний регистр,");
        System.out.println("2 - произвести реверс текста,");
        System.out.println("3 - сделать забор из букв.");
        Scanner scTrans = new Scanner(System.in);
        int userTrans = scTrans.nextInt();

        switch (userTrans){
            case 1:
                TextTransformer tr = new TextTransformer(userText);
                TextSaver ts1 = new TextSaver(tr, fileName);
                ts1.saveTextToFile(userText);
                break;
            case 2:
                InverseTransformer it = new InverseTransformer(userText);
                TextSaver ts2 = new TextSaver(it, fileName);
                ts2.saveTextToFile(userText);
                break;
            case 3:
                UpDownTransformer ut = new UpDownTransformer(userText);
                TextSaver ts3 = new TextSaver(ut, fileName);
                ts3.saveTextToFile(userText);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
