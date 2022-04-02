package _03_array_and_method.exercise;

import java.util.Scanner;

public class DemSoLanXuatHienKiTuTrongChuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String");
        String string = input.next();
        int length = string.length();
        System.out.println("Enter the character");
        String symbol = input.next();
        check(string, length, symbol);
    }
    public static void check(String string, int length, String symbol){
        int count =0;
        for (int i=0; i < length; i++){
            if (string.charAt(i) == symbol.charAt(0)){
                count++;
            }
        }
        System.out.println("Your character appears: "+count+" times");
    }
}
