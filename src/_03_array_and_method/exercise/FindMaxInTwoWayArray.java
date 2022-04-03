package _03_array_and_method.exercise;

import java.util.Scanner;

public class FindMaxInTwoWayArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length array1");
        int length1 = input.nextInt();
        System.out.println("Enter the length array2");
        int length2 = input.nextInt();
        double[][] array = new double[length1][length2];
        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                System.out.println("Enter the value of index " + i + " " + j);
                double value = input.nextDouble();
                array[i][j] = value;
            }
        }
        showMax( array, length1, length2);
    }
    public static void showMax (double [][]array, int length1, int length2){
        double max =array[0][0];
        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                if (max < array[i][j]){
                    max = array[i][j];
                }
            }
        }
        System.out.println("Max value in the matrix is: " + max);
    }
}
