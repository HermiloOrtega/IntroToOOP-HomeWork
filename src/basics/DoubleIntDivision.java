package basics;

public class DoubleIntDivision {
    public static void main(String[] args) {
        double x = 10;
        int y = 3;
        int z = 7;

        int a = z / y;    // 2
        double b = x / y; // 3.3333333

       // 'casting' -> force to change the type
        int c = (int) x / y;   // cast x and do the division
        int e = (int) (y / x); // cast after the division

        // z / y -> 2 -> (double) 2 -> 2.0
        double d = (double) (z / y);  // 2.0

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
