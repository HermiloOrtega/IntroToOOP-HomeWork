package polymorphism;

import java.util.Date;

public class SoftwareEngineer extends Employee {
    private String specialty;
    private static final double BONUS_RATE = 1.5;

    public SoftwareEngineer(String employeeId, long salary, Date startDate, String specialty) {
        super(employeeId, salary, startDate);
        this.specialty = specialty;
    }

    public boolean bugFixing(String repository) {
        return repository.length() > 10;
    }

    @Override
    public void work() {
        System.out.println("coding...");
    }

    @Override
    public long getSalary() {
        return (long) (super.getSalary() * BONUS_RATE);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "SoftwareEngineer{salary=" + getSalary() +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
