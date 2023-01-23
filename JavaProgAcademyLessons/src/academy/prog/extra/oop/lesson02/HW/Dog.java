package academy.prog.extra.oop.lesson02.HW;

public class Dog extends Animal{
    private String name;

    public Dog(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public Dog() {
    }

    @Override
    public String getVoice(){
        return "bark-bark";
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
        return getColor() + " собаку на ім'я " + name +
                ", котрий кушає " + getRation() + " та важить " + getWeight() + "кг";
    }
}
