package academy.prog.extra.oop.lesson02.HW;

public class Veterinarian {
    private String name;

    public Veterinarian(String name) {
        this.name = name;
    }

    public Veterinarian() {
    }

    public void treatment(Animal animal){
        System.out.println("Я лікую " + animal + ", він каже " + animal.getVoice());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Veterinarian{" +
                "name='" + name + '\'' +
                '}';
    }
}
