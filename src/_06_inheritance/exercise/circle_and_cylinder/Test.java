package _06_inheritance.exercise.circle_and_cylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(10.0, "yellow");
        Cylinder cylinder = new Cylinder(20.0, "red", 10.0);
        System.out.println("Propertive of circle: " + circle.toString());
        System.out.println("Area of circle is: " + circle.getArea());
        System.out.println("Propertive of cylinder is: " + cylinder.toString());
        System.out.println("The volume of cylinder: " + cylinder.getVolume());
    }
}
