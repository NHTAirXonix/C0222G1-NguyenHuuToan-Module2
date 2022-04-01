package _02_loop.exercise;

import java.util.Scanner;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int count = 0;
        int numbercheck = 2;
        while (count < 1) {
            int check = 0;
            for (int i = 2; i < numbercheck; i++) {
                if (numbercheck % i == 0) {
                    check++;
                }
            }
            if (check == 0) {
                if (numbercheck<100){
                    System.out.println(numbercheck);
                } else {
                    break;
                }
            }
        numbercheck++;
        }
    }
}
