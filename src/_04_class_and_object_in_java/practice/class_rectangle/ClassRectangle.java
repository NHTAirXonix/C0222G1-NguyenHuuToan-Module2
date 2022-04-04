package _04_class_and_object_in_java.practice.class_rectangle;

public class ClassRectangle {
    double width, height;

    public ClassRectangle() {
    }

    public ClassRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width = " + width + ", height = " + height + "}";
    }



}
