package basics;

public class Loops {
    public static void main(String[] args) {
        // 1. for-loop
        // for (initialize var; condition; incr or decr) { }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // Infinite loop
        for (;;) {
            System.out.println("Hi");
            break;
        }

        // 2. while-loop
        // while (condition) { }
        while (true) {
            // infinite loop
            System.out.println("Bye");
            break;
        }

        // Exercise
        // Using for-loop
        // 1. print integer from 1 to 20, but 10 numbers each line
        // ex) 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        //     11, 12, 13, 14, 15, 16, 17, 18, 19, 20
        for (int i = 1; i < 21; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
            } else {
                System.out.print(i + ", ");
            }
        }

        // Using while-loop
        // 2. print even numbers from 1 to 10
        // ex) 2 4 6 8 10
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
