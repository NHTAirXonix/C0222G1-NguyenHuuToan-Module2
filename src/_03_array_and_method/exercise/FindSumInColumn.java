package _03_array_and_method.exercise;

import java.util.Scanner;

public class FindSumInColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length array1");
        int length1 = input.nextInt();
        System.out.println("Enter the length array2");
        int length2 = input.nextInt();
        System.out.println("Enter the column");
        int column = input.nextInt();
        double[][] array = new double[length1][length2];
        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                System.out.println("Enter the value of index " + i + " " + j);
                double value = input.nextDouble();
                array[i][j] = value;
            }
        }

        showSum(array, length1, length2, column);
    }

    public static void showSum(double[][] array, int length1, int length2, int column) {
        double sum = 0;
        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                if (j == column) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("The sum of column " + column + " is: " + sum);
    }
}
