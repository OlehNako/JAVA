package academy.prog.extra.oop.lesson01.oopHW.task2;

public class Main {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle(3, 4, 5);
        Triangle tr2 = new Triangle(10, 6, 7);
        Triangle tr3 = new Triangle(2, 2, 2);

        System.out.println(tr1.getS());
        System.out.println(tr2.getS());
        System.out.println(tr3.getS());
    }
}
