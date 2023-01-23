package academy.prog.extra.oop.lesson02;

public class Developer extends Employee{
    private String skill;

    public Developer(String name, String lastName, int id, String department, String skill) {
        super(name, lastName, id, department);
        this.skill = skill;
        setId(id);
    }

    public Developer() {
    }

    @Override
    public void setId(int id){
        id = (id/10)*10;
        super.setId(id);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "skill=" + skill + ", department = " + getDepartment() + ",  id = " + getId() + ", last name = " + getLastName() + ", name = " + getName() + "}";
    }
}
