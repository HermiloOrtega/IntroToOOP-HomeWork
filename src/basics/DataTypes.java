package basics;

public class DataTypes {
    public static void main(String[] args) {
        // Primitive types
        // - the value(itself) gets stored in memory

        // To create a variable in Java
        // Java is statically typed Language!
        // (syntax)
        // type variableName = value;

        byte a = 127;    // 8 bits (-128 to 127)
        short b = 2020;  // 16 bits (-2^15 to 2^15)
        int c = 1000;    // 32 bits (-2^31 to 2^31)
        long d = 12301L;  // 64 bits (-2^63 to 2^63)

        char e = 'A';    // 8 bits - single char (single quote)
        boolean f = true; // or false (1 or 0)
        float g = 3.14f;  // 32 bits (floating point numbers)
        double h = 3.14;  // 64 bits (double-precision) floating point numbers

        // Operators
        // Arithmetic: +, -, *, /, %
        // Assignment: =
        // Comparison: >, <, >=, <=, ==, !=
        // Logical: && (and), || (or), ! (not)
        // Increment(Decrement): ++, --
        int x = 10;
        int y = ++x;  // y = 11, prefix (increment and assign)
        int z = x++;  // z = 11, postfix (assign and increment)
        System.out.println(x); // x = 12
    }
}
