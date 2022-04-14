package _11_dsa_stack_queue.exercise.change_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class ChangeToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result = "";
        Stack<Integer> stacks = new Stack<>();
        System.out.println("Enter your number:");
        int enter = input.nextInt();
        while (enter != 0) {
            stacks.push(enter % 2);
            enter = enter / 2;
        }
        while (!stacks.isEmpty()) {
            result += stacks.pop();
        }
        System.out.println(result);
        stacks.clear();
    }
}
