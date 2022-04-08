package _07_abstractclass_interface.excercise.interface_resizeable;

import java.util.Scanner;

public class TestResize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Shape[] array = new Shape[2];
        array[0] = new Circle();
        array[1] = new Rectangle();

        for (Shape arr : array) {
            System.out.println(arr.toString());
        }

        System.out.println("Enter the percent your want to resize a shape in an array: ");
        double inputs = input.nextDouble();

        for (Shape arr : array) {
            arr.resize(inputs);
            System.out.println(arr.toString());
        }

    }
}
