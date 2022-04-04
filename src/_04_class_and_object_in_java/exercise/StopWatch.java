package _04_class_and_object_in_java.exercise;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StopWatchs watch1 = new StopWatchs();
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
    }

    public static class StopWatchs {
        private long input1, input2;

        public StopWatchs() {
            this.input1 = 0;
            this.input2 = 0;
        }

        public void setInput1(long put1) {
            this.input1 = put1;
        }

        public void setInput2(long put2) {
            this.input2 = put2;
        }

        public long timeElapsed() {
            return this.input2 - this.input1;
        }
    }
}
