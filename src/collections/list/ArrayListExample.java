package collections.list;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // * creating an Empty ArrayList of Strings
        // <Type> : generic
        ArrayList<String> countries = new ArrayList<>();

        // 1. add(obj): add the obj at the end of the list
        countries.add("Taiwan");
        countries.add("Greece");
        countries.add("Canada");
        countries.add("USA");
        countries.add("Japan");
        countries.add("Brazil");
        countries.add("Mexico");
        countries.add("Colombia");

        // 2. print the array list
        System.out.println(countries);

        // 3. size() : get the length of the list
        System.out.println(countries.size());

        // 4. add(i, obj) : add the obj at index i
        countries.add(0, "France");

        // 5. get(i) : get the obj at index i
        System.out.println(countries.get(2));

        // 6. set(i, newObj) : set the obj at i to newObj
        countries.set(0, "China");
        System.out.println(countries);

        // 7. remove(obj) : remove the obj from the list
        countries.remove("Greece");
        System.out.println(countries);

        // 8. remove(i) : remove obj at index i
        // 9. contains(obj) : check if the array list contains the obj
        //                    (true, false)
        System.out.println(countries.contains("Canada"));

        // 10. clear() : clears the list. (remove all objects)
        countries.clear();
        System.out.println(countries);
    }
}
