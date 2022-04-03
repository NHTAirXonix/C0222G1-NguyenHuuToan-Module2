package _02_loop.exercise;

import java.util.Scanner;

public class ShowTypesOfGeometry {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the triangle");
            System.out.println("3. isosceles triangle ");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the height");
                    int height = scanner.nextInt();
                    System.out.println("Enter the width");
                    int width = scanner.nextInt();
                    System.out.println("Draw the rectangle");
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("1 top left");
                    System.out.println("2 top right");
                    System.out.println("3 bottom lef");
                    System.out.println("4 bottom right");
                    System.out.println("Enter your choose");
                    int choose = scanner.nextInt();
                    switch (choose) {
                        case 1:
                            System.out.println("Enter the height");
                            int height1 = scanner.nextInt();
                            for (int i = 1; i <= height1; i++) {
                                for (int j = 5; j - i + 1 >= 1; j--) {
                                    System.out.print("*");
                                }
                                System.out.println("");
                            }
                            break;
                        case 2:
                            System.out.println("Enter the height");
                            int height2 = scanner.nextInt();
                            for (int i = 1; i <= height2; i++) {
                                for (int j = 1; j < i; j++) {
                                    System.out.print(" ");
                                }
                                for (int j = 5; j - i + 1 >= 1; j--) {
                                    System.out.print("*");
                                }
                                System.out.println("");
                            }
                            break;
                        case 3:
                            System.out.println("Enter the height");
                            int height3 = scanner.nextInt();
                            for (int i = 1; i <= height3; i++) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println("");
                            }
                            break;
                        case 4:
                            System.out.println("Enter the height");
                            int height4 = scanner.nextInt();
                            for (int i = 1; i <= height4; i++) {
                                for (int j = 5; j - i + 1 >= 1; j--) {
                                    System.out.print(" ");
                                }
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println("");
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Enter the height");
                    int height5 = scanner.nextInt();
                    for (int i = 1, n= 0; i <= (height5*2)-1; i+=2, n++) {
                        for (int j = height5; j - n >= 1; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i ; j++) {
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