package _02_loop.exercise;

import java.util.Scanner;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        double count = 0;
        int numbercheck = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of prime number your want to prints");
        int input = scanner.nextInt();
        while (count < input) {
            int check = 0;
            for (int i = 3; i < numbercheck; i += 2) {
                if (numbercheck % i == 0) {
                    check++;
                }
            }
            if (check == 0) {
                System.out.println(numbercheck);
                count++;
            }
            numbercheck++;
        }
    }
}
