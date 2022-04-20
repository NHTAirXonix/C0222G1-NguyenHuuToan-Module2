package _15_exception_handling_and_debug.excercise.using_legal_triangle_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check)
            try {
                System.out.println("Enter three side of triangle");
                System.out.println("First side");
                double firstSide = Double.parseDouble(scanner.nextLine());
                System.out.println("Second side");
                double secondSide = Double.parseDouble(scanner.nextLine());
                System.out.println("Third side");
                double thirdSide = Double.parseDouble(scanner.nextLine());
                if (firstSide > 0 || secondSide > 0 || thirdSide > 0) {
                    throw new Negativenumber("Don't input a negative number");
                }
                checkTriangleSide(firstSide, secondSide, thirdSide);
                check = false;
            } catch (
                    InputMismatchException e) {
                System.err.println("Wrong format input");
                check = true;
            } catch (NumberFormatException e) {
                System.err.println("Please enter number");
                check = true;
            } catch (Negativenumber e) {
                System.err.println(e.getMessage());
            } catch (IllegalTriangleException e) {
                System.err.println(e.getMessage());
                check = true;
            }
    }

    public static void checkTriangleSide(double firstSide, double secondSide, double thirdSide) throws IllegalTriangleException, Negativenumber {
        if (firstSide + secondSide > thirdSide &&
                firstSide + thirdSide > secondSide &&
                secondSide + thirdSide > firstSide &&
                firstSide > 0 &&
                secondSide > 0 &&
                thirdSide > 0) {
                int c = 89/0;
            System.out.println("Your input value can make a triangle");
        } else {
            throw new IllegalTriangleException("Your input value can't make a triangle");
        }
    }
}
