package academy.prog.extra.oop.lesson02;

public class Company {
    private String name;
    private Employee[] staff = new Employee[5];
    private int i = 0;

    public Company(String name) {
        this.name = name;
    }

    public Company() {

    }

    public void addEmployee (Employee obj){
        if (i<5){
            staff[i]=obj;
            i++;
        }
    }

    public Employee findEmployee(int id){
        for (int j = 0; j < i; j++) {
            if (staff[j].getId() == id){
                return staff[j];
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString(){
//        StringBuilder sb = new StringBuilder("Company staff:");
//        for (int j = 0; j < i; j++) {
//            sb.append('\n');
//            sb.append(j + ". " + staff[i].getName() + " " + staff[i].getLastName());
//        }
//        return sb.toString();
        String result = "Company [name="+ name + ", employes=";
        for (int j = 0; j < i; j++) {
            result+=staff[j].toString() + ", ";
        }
        result+="]";
        return result;
    }

}
