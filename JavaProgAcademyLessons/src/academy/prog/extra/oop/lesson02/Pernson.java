package academy.prog.extra.oop.lesson02;

public class Pernson {
private String name;
private String lastName;

    public Pernson(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Pernson() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Pernson{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
