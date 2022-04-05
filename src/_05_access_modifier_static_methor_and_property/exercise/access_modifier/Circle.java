package _05_access_modifier_static_methor_and_property.exercise.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
}
