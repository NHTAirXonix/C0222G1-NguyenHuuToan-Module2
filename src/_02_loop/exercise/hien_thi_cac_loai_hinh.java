package _02_loop.exercise;

import java.util.Scanner;

public class hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the height");
                    double height = scanner.nextDouble();
                    System.out.println("Enter the width");
                    double width = scanner.nextDouble();
                    System.out.println("Draw the rectangle");
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Enter the height");
                    double height1 = scanner.nextDouble();
                    System.out.println("Draw the triangle");
                    for (int i = 1; i <= height1; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Enter the height");
                    double height2 = scanner.nextDouble();
                    System.out.println("Draw the triangle 2");
                    for (int i = 1; i <= height2; i++) {
                        for (int j = 5; j-i+1 >= 1 ; j--) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}