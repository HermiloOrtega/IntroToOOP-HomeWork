package polymorphism;

import java.util.Date;

public class Designer extends Employee {
    private boolean hasUXSkills;

    public Designer(String employeeId, long salary, Date startDate, boolean hasUXSkills) {
        super(employeeId, salary, startDate);
        this.hasUXSkills = hasUXSkills;
    }

    @Override
    public void work() {
        System.out.println("drawing a nice UI prototype...");
    }

    public boolean isHasUXSkills() {
        return hasUXSkills;
    }

    public void setHasUXSkills(boolean hasUXSkills) {
        this.hasUXSkills = hasUXSkills;
    }

    @Override
    public String toString() {
        return "Designer{" +
                "hasUXSkills=" + hasUXSkills +
                '}';
    }
}
