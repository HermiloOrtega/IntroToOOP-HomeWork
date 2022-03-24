package collections.list;

import java.util.*;

// "generic" type <E> : Element
public class MyArrayList<E> implements List<E> {
    /* The maximum size of array to allocate. Attempts to allocate larger arrays "may" result in OutOfMemoryOrder */
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementData;
    private int size = 0;

    public MyArrayList() { elementData = new Object[DEFAULT_CAPACITY]; }
    public MyArrayList(int initialCapacity) {
        if (initialCapacity >= 0) elementData = new Object[initialCapacity];
        else                      throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
    }
    public MyArrayList(Collection<? extends E> c) { elementData = c.toArray(); } // <? extends E> -> any type that extends E

    @Override public E           get(int index) {
        if (index < 0 || index >= size) throw new ArrayIndexOutOfBoundsException("Index " + index + ", size: " + size);
        return (E) elementData[index];
    }
    @Override public E           set(int index, E element) {
        if (index < 0 || index >= size) throw new ArrayIndexOutOfBoundsException("Index " + index + ", size: " + size);
        E oldValue = (E) elementData[index];
        elementData[index] = element;
        return oldValue;
    }

    @Override public int         size()              { return size; }
    @Override public boolean     isEmpty()           { return size == 0; }
    @Override public Iterator<E> iterator()          { return null; }

    @Override public Object[]    toArray()           { return Arrays.copyOf(elementData, size); }
    @Override public <T> T[]     toArray(T[] a) {
        T[] list = (T[])Arrays.copyOf(elementData, a.length + elementData.length , a.getClass());
        return list;
    }

    @Override public boolean     contains(Object o)  { return indexOf(o) >= 0; }
    @Override public boolean     containsAll(Collection<?> c) {
        int num = 0;
        for (Object item: c) {
            for (Object e: elementData) {
                if (e == item){
                    num++;
                    break;
                }
            }
        }
        if (num == c.size()) return true;
        else                 return false;
    }

    @Override public boolean     add(E e) {
        if (size == elementData.length) elementData = grow(size + 1);  // grow (increases by 50%)
        elementData[size] = e;
        size++;
        return true;
    }
    @Override public void        add(int index, E element) {
        if (size == elementData.length)         elementData = grow(size + 1);
        for (int i = size; i >= index + 1; i--) elementData[i] = elementData[i - 1];
        elementData[index] = element;
        size++;
    }
    @Override public boolean     addAll(Collection<? extends E> c) {
        if (size + c.size() > elementData.length) elementData = grow(c.size());
        int lastNewIndex = size + c.size() - 1;
        int lastIndex = size - 1;

        for (int i = lastNewIndex; i > index; i--) {
            elementData[lastNewIndex] = elementData[lastIndex];
            lastNewIndex--; lastIndex--;
        }
        for (E item : c) {
            elementData[index] = item;
            index++; size++;
        }
        return true;
    }

    @Override public boolean     remove(Object o) {
        if (contains(o)){
            int index = 0;
            for (int i = 0; i < size; i++) {
                if (elementData[i] == o) {
                    index = i;
                    break;
                }
            }
            remove(index);
            return true;
        }
        return false;
    }
    @Override public E           remove(int index) {
        if (index < 0 || index >= size) throw new ArrayIndexOutOfBoundsException("Index " + index + ", size: " + size);
        E elementRemoved = (E) elementData[index];
        size--;
        for (int i = index; i < size; i++) elementData[i] = elementData[i+1];
        elementData[size] = null;
        return elementRemoved;
    }
    @Override public boolean     removeAll(Collection<?> c) {
        for (Object item: c) while (contains(item)) remove(item);
        return false;
    }
    @Override public boolean     retainAll(Collection<?> c) {
        for (int i = size - 1; i >= 0; i--) {
            if (!c.contains(elementData[i])) remove(elementData[i]);
        }
        return true;
    }
    @Override public void        clear() {
        data = (E[])new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override public int         indexOf(Object o) {
        return searchObject(o) > -1;
    }
    @Override public int         lastIndexOf(Object o) {
        int index = -1;
        if (contains(o)) index = searchObject(o);
        return index;
    }

    @Override public             ListIterator<E> listIterator() {
        return null;
    }
    @Override public             ListIterator<E> listIterator(int index) {
        return null;
    }
    @Override public             List<E> subList(int fromIndex, int toIndex) {
        List<E> list = new MyArrayList<E>(toIndex - fromIndex);
        for (int i = fromIndex; i < toIndex; i++) list.add((E) elementData[i]);
        return list;
    }

    private int searchObject(Object o){
        int index = 0;
        for (int i = 0; i < size; i++) if (elementData[i] == o) index = i;
        return index;
    }
    private Object[] grow(int minCapacity) {
        return elementData = Arrays.copyOf(elementData, newCapacity(minCapacity));
    }
    private int newCapacity(int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity <= minCapacity) {
            if (minCapacity < 0 || minCapacity > MAX_ARRAY_SIZE) {
                throw new OutOfMemoryError("integer overflow");
            }
            return minCapacity;
        }
        return (newCapacity <= MAX_ARRAY_SIZE) ? newCapacity : Integer.MAX_VALUE;
    }
}
