package _06_Inheritance.exercise.point2d_point3d;

public class Test {
    public static void main(String[] args) {
        Point2D check1 = new Point2D(2.5f, 5.5f);
        System.out.println("Check 2D");
        System.out.printf(check1.toString());
        System.out.println("\nCheck 3D");
        Point3D check2 = new Point3D(4.5f);
        System.out.println(check2.toString());
        System.out.println("Check 3D inheritance 2D");
        Point3D check3 = new Point3D(3.5f,4.5f,5.5f);
        System.out.println(check3.toString());

    }
}
