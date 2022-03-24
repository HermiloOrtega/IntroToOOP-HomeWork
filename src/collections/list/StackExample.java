package collections.list;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // java 1.0 legacy (old)
        Stack<String> st = new Stack<>();

        // recommended way of using stack
        Deque<String> stack = new ArrayDeque<>();
        stack.push("China");
        stack.push("South Korea");
        stack.push("Italy");
        stack.push("Iran");
        stack.push("Japan");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
            System.out.println(stack.size());
        }
    }

    /**
     * Return -1 if code's () or {} are balanced
     * Return the index at which an imbalance occurs.
     * Return the length of code(String) if ( or { are never closed
     * @param code source code
     *
     *   ( -> )
     *   { -> }
     *   if it's an opening, push onto the stack
     *   if it's a closing, pop and compare
     *
     *  checkBalance("if (a(4) > 9) { foo(a(2)); }") returns -1
     *  checkBalance("for  (i=0;i<(3};i++) { foo{)); )") returns 14
     *  checkBalance("if (x)  {") returns 8
     */
    public static int checkBalance(String code) {
        // map == dictionary (key-value pair)
        HashMap<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        Deque<Character> stack = new ArrayDeque<>();
        char[] chars = code.toCharArray();
        for (int i = 0; i < code.length(); i++) {
            char ch = chars[i];
            if (ch == '(' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}') {
                if (!stack.isEmpty()) {
                    char top = stack.pop();
                    if (top != map.get(ch)) {
                        return i;
                    }
                } else {
                    return i;
                }
            }
        }
        if (!stack.isEmpty()) {
            return code.length();
        }

        return -1;
    }
}
