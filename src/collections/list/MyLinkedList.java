package collections.list;

// Doubly-Linked list
public class MyLinkedList<E> {
    private int size;
    private Node head, tail;

    private static class Node<E> {
        E data;
        Node next;
        Node prev;
        Node(E data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }
    public boolean contains(E data) {
        if (size>0){
            for (int i = 0; i < size; i++) {
                if (head == data) return true;
                head = head.next;
            }
        }
        return false;
    }
    public void add(E data) {
        Node node = new Node(data, null, null);
        if (isEmpty())  {
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }
    public void add(int i, E data) {
        if (i < 0 || i >= size) throw new ArrayIndexOutOfBoundsException("Index " + index + ", size: " + size);
        Node node = new Node(data,null, null);
        //jh  sm  am  eo
        //0   1   2   3
        if (i == 0) {
            //                     v
            head.prev = node;   // dm  jh  sm  am  eo
            head = node;        // 0   1   2   3   4
        } else if (i == size - 1) {
            //                                     v
            tail.next = node;   // jh  sm  am  eo  dm
            tail = node;        // 0   1   2   3   4
        } else if (i < size / 2) { // option if the new item is before half, the moves are from the head to the tail
            //      v
            // jh   dm  sm  am  eo
            // 0    1   2   3   4
            Node prev = head;
            for (int j = 0; j < i; j++) prev = prev.next;
            node.next = prev.next;
            node.prev = prev;
            prev.next.prev = node;
            prev.next = node;
        } else { // option if the new item is after half, the moves are from the tail to the head
            //              v
            // jh   am  sm  dm  eo
            // 0    1   2   3   4
            Node prev = tail;
            for (int k = size; k > i; k--) {
                prev = prev.prev;
            }
            node.prev = prev;
            node.next = prev.next;
            prev.next.prev = node;
            prev.next = node;
        }
        size++;
    }
    public E remove(int i) {
        if (i < size / 2) {
            Node prev = head;
            for (int k = 0; k < i; k++) {
                prev = prev.next;
            }
            prev.next.prev = prev.prev;
            prev.prev.next = prev.next;
            prev.prev = null;
            prev.next = null;
            return (E) prev;
        } else {
            Node prev = tail;
            for (int k = size - 1; k > i; k--) {
                prev = prev.prev;
            }
            prev.prev.next = prev.next;
            prev.next.prev = prev.prev;
            prev.prev = null;
            prev.next = null;
            return (E) prev;
        }
        return null;
    }
    public E get(int i) {
        Node temp = head;
        for (int k = 0; k < i; k++) temp = temp.next;
        return (E) temp.data;
        return null;
    }
    public E set(int i, E newData) {
        if (i < 0 || i >= size) throw new ArrayIndexOutOfBoundsException("Index " + index + ", size: " + size);
        Node node = head;
        int cursor = 0;
        while (node != null) {
            if (cursor == i) {
                E tmp = (E)node.data;
                node.data = newData;
                return tmp;
            }
            cursor++;
            node = node.next;
        }
        return null;
    }

    @Override public String toString() {
        Node node = head;
        String result = "";
        if (size>0) {
            while (head != null) {
                result = result + node.data.toString() + "==";
                node = node.next;
            }
        }
        result = result + "null";
        return result;
    }
}
