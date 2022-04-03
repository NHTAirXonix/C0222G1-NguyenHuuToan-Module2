package _03_array_and_method.exercise;

import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length array");
        int length = input.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter the value of index " + i);
            int input1 = input.nextInt();
            array[i] = input1;
        }
        showMin(array, length);
    }

    public static void showMin(int []array, int length) {
        int min = array[0];
        for (int i = 1; i < length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("The min is: " + min);
    }
}
