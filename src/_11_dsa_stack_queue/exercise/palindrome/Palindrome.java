package _11_dsa_stack_queue.exercise.palindrome;


import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String getin = input.nextLine();
        String [] arrayStr = getin.toLowerCase().split("");
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        String result = "";
        for (int i=0;i<arrayStr.length; i++){
            queue.add(arrayStr[i]);
            stack.add(arrayStr[i]);
        }
        while (!stack.isEmpty()){
            if (stack.pop().equals(queue.poll())){
                result = "Your String is Palindrome";
            } else {
                result = "Your String isn't Palindrome";
                break;
            }
        }
        System.out.println(result);
    }
}
