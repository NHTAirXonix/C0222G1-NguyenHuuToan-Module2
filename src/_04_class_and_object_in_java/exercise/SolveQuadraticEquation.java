package _04_class_and_object_in_java.exercise;


import java.util.Scanner;

class SolveQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ax2 + bx + x = 0");
        System.out.println("Enter number a: ");
        double numbera = input.nextDouble();
        System.out.println("Enter number b: ");
        double numberb = input.nextDouble();
        System.out.println("Enter number c: ");
        double numberc = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(numbera, numberb, numberc);
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

    public static class QuadraticEquation {
        private double a, b, c;

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getA() {
            return this.a;
        }

        public double getB() {
            return this.b;
        }

        public double getC() {
            return this.c;
        }

        public double getDiscriminant() {
            return ((this.b * this.b) - (4 * this.a * this.c));
        }

        public double getRoo1() {
            if (getDiscriminant() >= 0) {
                return ((-1 * this.b) + (Math.sqrt(getDiscriminant()))) / (2 * this.a);
            } else {
                return 0;
            }

        }

        public double getRoo2() {
            if (getDiscriminant() >= 0) {
                return ((-1 * this.b) - (Math.sqrt(getDiscriminant()))) / (2 * this.a);
            } else {
                return 0;
            }
        }
    }
}
