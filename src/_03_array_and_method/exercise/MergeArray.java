package _03_array_and_method.exercise;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length array1");
        int length1 = input.nextInt();
        System.out.println("Enter the length array2");
        int length2 = input.nextInt();
        int[] array1 = new int[length1];
        int[] array2 = new int[length2];
        for (int i = 0; i < length1; i++) {
            System.out.println("Enter the value of index " + i);
            int input1 = input.nextInt();
            array1[i] = input1;
        }
        for (int i = 0; i < length2; i++) {
            System.out.println("Enter the value of index " + i);
            int input2 = input.nextInt();
            array2[i] = input2;
        }
        mergeArray(array1, array2, length1, length2);
    }
    public static void mergeArray (int[] array1, int[] array2,int length1,int length2){
        int[] array3 = new int[length1 + length2];
        for (int i = 0; i < length1 + length2; i++) {
            if (i < length1) {
                array3[i] = array1[i];
            } else {
                array3[i] = array2[i - array1.length];
            }
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array3.length; j++) {
            System.out.print(array3[j] + "  ");
        }
    }
}
