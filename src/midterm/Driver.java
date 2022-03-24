package midterm;

import java.util.ArrayList;

public class Driver {
    // "instance variable" ArrayList of 'Object'
    //  - not static
    private ArrayList<String> objs = new ArrayList<>();

    // helper methods
    public void addObject(String obj) {
        objs.add(obj);
    }

    public void printObjs() {
        for (String obj : objs) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        Driver d = new Driver();
        d.addObject("Hello");
        d.addObject("Hi");
        d.addObject("Hola");
        d.printObjs();
    }
}
