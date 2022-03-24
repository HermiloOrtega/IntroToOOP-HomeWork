package collections.queue;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
//        Queue<String> q = new ArrayDeque<>();
//        Queue<String> pq = new PriorityQueue<>();

        Queue<String> queue = new LinkedList<>(); // most common
        queue.offer("Coke");
        queue.offer("Pepsi");
        queue.offer("Ginger Ale");
        queue.offer("Sprite");
        queue.offer("Fanta");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        stutter(q);
        System.out.println(q);

        Queue<String> mq = new LinkedList<>();
        mq.offer("a");
        mq.offer("b");
        mq.offer("c");
        mirror(mq);
        System.out.println(mq);
    }

    public static void stutter(Queue<Integer> q) {
        int size = q.size();
        for (int i = 0; i < size; i++) {
            int front = q.poll();
            q.add(front);
            q.add(front);
        }
    }

    public static void mirror(Queue<String> q) {
        Deque<String> stack = new ArrayDeque<>();
        int length = q.size();
        while (length --> 0) {
            String elem = q.poll();
            q.offer(elem);
            stack.push(elem);
        }
        while (!stack.isEmpty()) {
            q.offer(stack.pop());
        }
    }
}
