package polymorphism;

import java.util.Date;

// abstract class
// - cannot create an instance
// - can have abstract methods
public abstract class Employee {
    // data fields
    private String employeeId;
    private long salary;
    private Date startDate;

    // constructor (?)
    public Employee(String employeeId, long salary, Date startDate) {
        this.employeeId = employeeId;
        this.salary = salary;
        this.startDate = startDate;
    }

    public abstract void work();

    // getters
    public String getEmployeeId() {
        return employeeId;
    }

    public long getSalary() {
        return salary;
    }

    public Date getStartDate() {
        return startDate;
    }
}
