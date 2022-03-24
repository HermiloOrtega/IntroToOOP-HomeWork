package finalstatic;

public class Driver {
    public static void main(String[] args) {
        // System.out.println(Math.PI);  // static variable
        // System.out.println(Math.sqrt(4));  // static method
        // System.out.println(Math.PI); // static
        // System.out.println(Math.max(10, 2));
        Time t1 = new Time(23);
        Time t2 = new Time(9, 11, 23);
        Time t3 = new Time(22, 10);
        Time t4 = new Time(23, 2, 5);
        Time t5 = new Time();
        System.out.println(Time.instanceCount);

        Time[] times = {t1, t2, t3, t4, t5};
        for (Time time : times) {
            System.out.println(time.toStandardForm());
            System.out.println(time.toUniversalForm());
        }

        // throws an exception
        // Time t2 = new Time(20, 30, -10);
    }
}
