package _11_dsa_stack_queue.exercise.check_sign;

import java.util.Scanner;
import java.util.Stack;

public class CheckSign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String getIn = input.nextLine();
        String[] arrayStr = getIn.split("");
        Stack<String> bstack = new Stack<>();
        boolean result = true;
        String left = "";
        for (int i = 0; i < arrayStr.length; i++) {

            if (arrayStr[i].equals("(")) {
                bstack.push(arrayStr[i]);
            }
            if (arrayStr[i].equals(")")) {
                if (bstack.isEmpty()) {
                    result = false;
                    break;
                }
                left = bstack.pop();

            }
            if (left.equals(arrayStr[i])) {
                result = false;
                break;
            }
        }
        if (bstack.isEmpty()) {
            result = true;
            System.out.println(result);
        } else {
            result = false;
            System.out.println(result);
        }

    }
}
