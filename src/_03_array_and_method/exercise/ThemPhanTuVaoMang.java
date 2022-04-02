package _03_array_and_method.exercise;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 0, 0};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to add");
        int number = input.nextInt();
        System.out.println("Enter the position you want to add");
        int position = input.nextInt();
        add(arr, number, position);
    }

    public static void add(int[] arr, int number, int position) {
        int hold1;
        for (int i = 0; i < arr.length; i++) {
            if (position == i) {
                for (int j = i; j < arr.length; j++, i++) {
                    if (j == arr.length - 1) {
                        arr[j] = number;
                        continue;
                    }
                    hold1 = arr[j];
                    arr[j] = number;
                    number = hold1;
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
