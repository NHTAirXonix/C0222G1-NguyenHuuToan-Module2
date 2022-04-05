package _02_loop.exercise;

public class ShowPrimeNumberLowerThan100 {
    public static void main(String[] args) {
        int numbercheck = 2;
        while (true) {
            if (numbercheck > 100) {
                break;
            }
            int check = 0;
            for (int i = 3; i < numbercheck; i += 2) {
                if (numbercheck % i == 0) {
                    check++;
                }
            }
            if (check == 0) {
                System.out.println(numbercheck);
            }
            numbercheck++;
        }
    }
}
