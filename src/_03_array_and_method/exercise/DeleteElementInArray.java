package _03_array_and_method.exercise;

import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to delete");
        int number = input.nextInt();
        delete(arr, number);
    }

    public static void delete(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                for (int j = i; j < arr.length; j++,i++) {
                    if (j == arr.length - 1) {
                        arr[j] = 0;
                        continue;
                    }
                    arr[j] = arr[j + 1];
                }
                break;
            }
        }
        System.out.print("Property list: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "  ");
        }
    }
}
