package collections.list;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<>();
        ll1.add("Hello"); // O(1): insertion
        ll1.add("Hi");
        ll1.add("Bye");
        ll1.add(0, "Hola");
        ll1.contains("Hi"); // search O(n)
        ll1.remove(0); // O(n)
        ll1.get(2); // O(n)
        ll1.set(2, "Ola");
        MySLinkedList<String> mll = new MySLinkedList<>();
        mll.add("Canada");
        mll.add("Brazil");
        mll.add("Mexico");
        mll.add("Japan");
        mll.add("Slovakia");

        System.out.println(mll.get(2));
        mll.set(2, "Mehico");
        mll.set(3, "Nihon");
        System.out.println(mll.get(2));
        System.out.println(mll.get(3));

        System.out.println(mll);
    }
}
