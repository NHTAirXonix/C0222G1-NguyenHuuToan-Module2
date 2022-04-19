package _14_sort_algorithms.exercise.show_step_of_insectionsort;

public class InsertionSort {
    public static void insertionSort(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            System.out.println("Step " + i + " push " + arr[j + 1] + " in an subarray");
            displayArray(arr);
        }
    }

    static void displayArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6};
        System.out.println("Origin Array:");
        displayArray(arr);
        insertionSort(arr);
        System.out.println("After Sort:");
        displayArray(arr);
    }
}
