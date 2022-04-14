package _11_dsa_stack_queue.exercise.reverse_array_interger_by_stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class ReverseArrayIntergerByStack<T> {
    private LinkedList<T> stack;

    public ReverseArrayIntergerByStack() {
        stack = new LinkedList();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
