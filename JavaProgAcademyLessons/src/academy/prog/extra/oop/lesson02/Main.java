package academy.prog.extra.oop.lesson02;

public class Main {
    public static void main(String[] args) {

        Employee em = new Employee("George", "Ts", 10, "developer");
        Employee em1 = new Employee("Edward", "Bilfo", 1111, "developer");
        Employee em2 = new Employee("Henri", "Astro", 278, "developer");

//        Pernson person = em;
//        Developer dev = new Developer("Stas", "HTC", 15, "Sci dev", "Java");

//        System.out.println(em.getName());
//        System.out.println(em);
//        System.out.println(person.getName());
//        System.out.println(person.toString());
//        System.out.println(dev);

        Company company = new Company ("CoEating");
        company.addEmployee(em);
        company.addEmployee(em1);
        company.addEmployee(em2);

        System.out.println(company.findEmployee(10));
        System.out.println(company.findEmployee(12));
        System.out.println(company.findEmployee(278));
        System.out.println();

        System.out.println(company);

    }
}
