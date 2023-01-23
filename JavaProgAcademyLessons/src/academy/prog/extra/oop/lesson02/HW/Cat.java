package academy.prog.extra.oop.lesson02.HW;

public class Cat extends Animal{
    private String name;

    public Cat(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public Cat() {
    }

    @Override
    public String getVoice(){
        return "meow-meow";
    }

    @Override
    public void eat(){
    }

    @Override
    public void sleep(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getColor() + " кота на ім'я " + name +
                ", котрий кушає " + getRation() + " та важить " + getWeight() + "кг";
    }
}
