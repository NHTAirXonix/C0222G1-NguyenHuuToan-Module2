package _04_class_and_object_in_java.exercise.stop_watch;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StopWatch.StopWatchs watch1 = new StopWatch.StopWatchs();
        String input1 = " ";
        long put1;
        while (!input1.equals("start")) {
            System.out.println("Input 'start' to input the time start ?");
            input1 = input.nextLine();
            if (input1.equals("start")) {
                put1 = System.currentTimeMillis();
                watch1.setInput1(put1);
            }
        }
        String input2 = " ";
        long put2;
        while (!input2.equals("stop")) {
            System.out.println("Input 'stop' to input the time stop ?");
            input2 = input.nextLine();
            if (input2.equals("stop")) {
                put2 = System.currentTimeMillis();
                watch1.setInput2(put2);
            }
        }
        System.out.println("Time elapsed is: "+watch1.timeElapsed() +" ms");
        int[] arr = new int[100000];
        for (int i =0; i <arr.length;i++){
            arr[i] = (int) Math.floor(((Math.random() * 99999) + 1));
        }
        int size = arr.length;
        put1 = System.currentTimeMillis();
        watch1.setInput1(put1);
        for (int i = 0; i < size - 1; i++) {
            int minPosition = i;

            for (int j = i + 1; j < size; j++) {

                if (arr[j] > arr[minPosition]) {
                    minPosition = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPosition];
            arr[minPosition] = temp;
        }
        put2 = System.currentTimeMillis();
        watch1.setInput2(put2);
        System.out.println("Time to do the selection sort is: "+watch1.timeElapsed() +" ms");
    }
}
