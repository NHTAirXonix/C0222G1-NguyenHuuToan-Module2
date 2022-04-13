package _10_dsa_list.exercise.use_arraylist_with_library;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        this.size = capacity;
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapacity(size);
        }
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        for (int i = index; i < size; i++) {
            if (i == size - 1) {
                continue;
            }
            elements[i] = elements[i + 1];
        }
        size--;
        elements = Arrays.copyOf(elements, size);
        return (E) elements[index];
    }

    public int size() {
        return size;
    }

    public E clone() {
        MyList<Integer> newarray = new MyList<Integer>();
        newarray.elements = Arrays.copyOf(elements, size);
        newarray.size = size;
        return (E) newarray;
    }

    public boolean contains(E o) {
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (elements[i] == o) {
                result = true;
            }
        }
        return result;
    }

    public int indexOf(E o) {
        int result = 0;
        for (int i = 0; i < size; i++) {
            if (o == elements[i]) {
                result = i;
            }
        }
        return result;
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity(size);
        }
        elements[size++] = e;
    }

    public void ensureCapacity(int minCapacity) {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }


    @Override
    public String toString() {
        String result = "";
        result += "[";
        for (int i = 0; i < size; i++) {
            result += elements[i].toString();
            if (i != size - 1) {
                result += ",";
            }
        }
        result += "]";
        return result;
    }
}
