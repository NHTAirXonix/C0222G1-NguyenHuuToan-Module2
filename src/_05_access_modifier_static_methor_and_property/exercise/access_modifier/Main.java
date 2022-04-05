package _05_access_modifier_static_methor_and_property.exercise.access_modifier;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(15.0);
        System.out.println("The radius of circle is: " + circle.getRadius());
        System.out.println("The area of circle is: "+ circle.getArea());
    }
}
