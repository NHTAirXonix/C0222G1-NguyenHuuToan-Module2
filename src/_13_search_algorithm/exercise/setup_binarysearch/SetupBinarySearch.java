package _13_search_algorithm.exercise.setup_binarysearch;

import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import java.util.Scanner;

public class SetupBinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 5, 7, 44, 4, 9, 2, 11, 22, 33, 99, 55, 15};
        int[] arrayIndex = {-1, -1, -1, -1, -1, -1};
        sortArray(array);
        show(array);
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the number you want to find: ");
        int value = Integer.parseInt(input.nextLine());
        int left = 0;
        int count = 0;
        int right = array.length - 1;

        // EM LAM 2 CACH - CACH CON LAI DE TRONG COMMENT - ANH MUON COI THI XOA CACH DANG DUNG DI ROI CHAY

        //int result = binarySearch(array, left, right, value, count, arrayIndex);
        int result = binarySearch(array, left, right, value);

        sortArray(arrayIndex);

        /*if (arrayIndex[5] < 0) {
            System.out.println("your number is not in an array");
        } else {
            System.out.println("Your number appear at index:" + arrayIndex[arrayIndex.length - 1]);
        }*/
        if (result!=-1){
            System.out.println("Your number appear at index: "+result);
        } else {
            System.out.println("Your number is not in an array");
        }
    }

    /*public static int binarySearch(int[] array, int left, int right, int value, int count, int[] arrayIndex) {
        int middle = (right + left) / 2;
        while (left <= right) {
            if (value > array[middle]) {
                left = middle + 1;
                arrayIndex[count] = middle;
                count++;
                binarySearch(array, left, right, value, count, arrayIndex);
                return middle;
            }
            if (value < array[middle]) {
                right = middle - 1;
                arrayIndex[count] = -middle;
                count++;
                binarySearch(array, left, right, value, count, arrayIndex);
                return middle;
            }
            if (value == array[middle]) {
                arrayIndex[count] = middle;
                return middle;

            }
        }
        return -1;
    }*/

    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle = (right + left) / 2;
        while (left <= right) {
            if (value > array[middle]) {
                return binarySearch(array, middle + 1, right, value);
            }
            if (value < array[middle]) {
                return binarySearch(array, left, middle - 1, value);
            }
            if (value == array[middle]) {
                return middle;
            }
        }
        return -1;
    }

    public static void sortArray(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
