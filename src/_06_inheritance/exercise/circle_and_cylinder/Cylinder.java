package _06_inheritance.exercise.circle_and_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getRadius() {
        return super.getRadius();
    }

    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    public String getColor(String color) {
        return super.getColor();
    }

    public void setColor(String color) {
        super.setColor(color);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "radius=" + getRadius() + ", color=" + getColor() +
                ", height=" + height +
                '}';
    }
}
