package academy.prog.extra.oop.lesson01.oopHW.task1;

public class Main {
    public static void main(String[] args) {

        ItemDescription item1 = new ItemDescription(12.22, "aboba", 2);
        ItemDescription item2 = new ItemDescription(48.10, "abeba", 3);

        System.out.println(item1.toString());
        System.out.println(item2.toString());

    }
}
