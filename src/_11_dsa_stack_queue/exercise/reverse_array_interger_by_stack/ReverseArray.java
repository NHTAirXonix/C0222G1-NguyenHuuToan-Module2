package _11_dsa_stack_queue.exercise.reverse_array_interger_by_stack;

import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arrays = {1, 3, 5, 7, 9};
        System.out.println("Before reverse:");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
            stack.push(arrays[i]);
        }
        System.out.println("\nAfter reverse:");

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = stack.pop();
            System.out.print(arrays[i] + " ");
        }

        String strings = "abcd efghi klmno";
        strings = strings.toLowerCase();
        String[] newarray = strings.split(" ");
        Stack<String> stackString =
                new Stack<>();
        System.out.println("\nBefore reverse:");
        for (int i = 0; i < newarray.length; i++) {
            System.out.print(newarray[i] + " ");
            stackString.push(newarray[i]);
        }
        System.out.println("\nAfter reverse:");

        for (int i = 0; i < newarray.length; i++) {
            newarray[i] = stackString.pop();
            System.out.print(newarray[i] + " ");
        }

    }
}
