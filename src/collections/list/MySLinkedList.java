package collections.list;

// Singly-Linked List
public class MySLinkedList<E> {
    // add, remove, get, contains, set
    // static inner class: nested class
    // non-static inner class: inner class
    private int size;
    private Node head; // first node
    private Node tail; // last node

    private static class Node<E> {
        E data;
        Node next;
        Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public MySLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(E data) {
        Node node = new Node(data, null);
        if (isEmpty()) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    public E remove(int i) {
        checkBounds(i);
        Node prev = head;
        for (int k = 0; k < i - 1; k++) {
            prev = prev.next;
        }
        Node removed = prev.next;
        prev.next = prev.next.next;
        return (E) removed.data;
    }

    public E get(int i) {
        checkBounds(i);
        Node temp = head;
        for (int k = 0; k < i; k++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public E set(int i, E newData) {
        checkBounds(i);
        Node prev = head;
        for (int k = 0; k < i - 1; k++) {
            prev = prev.next;
        }
        E prevData = (E) prev.next.data;
        Node next = prev.next.next;
        Node newNode = new Node(newData, next);
        prev.next = newNode;
        return prevData;
    }

    private void checkBounds(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + " out of range.");
        }
    }

    @Override
    public String toString() {
        Node temp = head;
        String result = "";
        while (temp != null) {
            result += temp.data + "->";
            temp = temp.next;
        }
        return result + "null";
    }
}
