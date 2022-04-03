package _03_array_and_method.exercise;

import java.util.Scanner;

public class CountAppearOfCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String");
        String string = input.nextLine();
        int length = string.length();
        System.out.println("Enter the character");
        char symbol = input.next().charAt(0);
        check(string, length, symbol);
    }
    public static void check(String string, int length, char symbol){
        int count =0;
        for (int i=0; i < length; i++){
            if (string.charAt(i) == symbol){
                count++;
            }
        }
        System.out.println("Your character appears: "+count+" times");
    }
}
