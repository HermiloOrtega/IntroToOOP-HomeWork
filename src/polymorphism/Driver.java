package polymorphism;

import java.util.ArrayList;
import java.util.Date;

public class Driver {
    public static void main(String[] args) {
        // At compile time, martin is a type of 'Employee'
        // At runtime, we know martin actually is a type of 'SoftwareEngineer'
        Employee martin = new SoftwareEngineer("50", 60_000, new Date(), "Java");
        Employee rick = new Designer("103", 40_000, new Date(), false);
        // down-casting (telling the compiler, "hey trust me martin is actually a software engineer object"
        // dynamic(runtime) binding
        System.out.println(((SoftwareEngineer) martin).bugFixing("remote"));
        // ((SoftwareEngineer) rick).bugFixing("remote"); ClassCastException - Runtime Error
        Employee rodrigo = new ProductManager("123", 80_000, new Date(), "CA102");
        Employee katsuya = new DataScientist("31", 70_000, new Date(), "SQL38");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(martin);
        employees.add(rick);
        employees.add(rodrigo);
        employees.add(katsuya);

        int totalSalary = 0;
        for (Employee emp : employees) {
            totalSalary += emp.getSalary();
            emp.work();
            System.out.println(emp);
        }
        System.out.println("Total salary : " + totalSalary);
    }
}
