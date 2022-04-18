package _13_search_algorithm.exercise.find_the_biggest_string;

import java.util.LinkedList;
import java.util.Scanner;

public class FindBiggestString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String string = input.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        max.add(string.charAt(0));

        for (int j = 1; j < string.length(); j++) {
            if (string.charAt(j) > max.getLast()) {
                max.add(string.charAt(j));
            }
        }
        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}