package _07_abstractclass_interface.excercise.interface_colorable;

public class Square extends Shape implements Colorable{
    private double side = 0.0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        double result = this.side * this.side;
        return result;
    }

    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
