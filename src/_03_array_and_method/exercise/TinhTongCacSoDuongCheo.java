package _03_array_and_method.exercise;

import java.util.Scanner;

public class TinhTongCacSoDuongCheo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length array1");
        int length = input.nextInt();
        double[][] array = new double[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.println("Enter the value of index " + i + " " + j);
                double value = input.nextDouble();
                array[i][j] = value;
            }
        }
        double result = calculatedSum(array);
        System.out.println("The sum of matrix is: " + result);
    }

    public static double calculatedSum(double[][] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j == i) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
}
