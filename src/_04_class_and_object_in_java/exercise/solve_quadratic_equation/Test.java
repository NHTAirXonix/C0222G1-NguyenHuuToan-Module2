package _04_class_and_object_in_java.exercise.solve_quadratic_equation;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ax2 + bx + x = 0");
        System.out.println("Enter number a: ");
        double numbera = input.nextDouble();
        System.out.println("Enter number b: ");
        double numberb = input.nextDouble();
        System.out.println("Enter number c: ");
        double numberc = input.nextDouble();
        SolveQuadraticEquation.QuadraticEquation quadraticEquation = new SolveQuadraticEquation.QuadraticEquation(numbera, numberb, numberc);
        System.out.println("The Delta is: " + quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("The root1 is: " + quadraticEquation.getRoo1());
            System.out.println("The root2 is: " + quadraticEquation.getRoo2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has one root = " + quadraticEquation.getRoo1());
        } else {
            System.out.println("The equation has no roots");
        }
    }

}
