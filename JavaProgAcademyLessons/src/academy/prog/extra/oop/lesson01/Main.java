package academy.prog.extra.oop.lesson01;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10, 14, 3);
        Box box2 = new Box(1, 200000000, 3);
        Box box3 = new Box(22, 33, 11);
        Box[] boxes = new Box[]{box1, box2, box3};
        System.out.println(maxBoxValue(boxes));
    }

    public static Box maxBoxValue(Box[] arr) {
        Box maxValueBox = arr[0];
        for (Box box :
                arr) {
            if (box.getValue() > maxValueBox.getValue()) {
                maxValueBox = box;
            }
        }
        return maxValueBox;
    }
}
