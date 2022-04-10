package _07_abstractclass_interface.excercise.interface_resizeable;


public class Square extends Shape {
    private double side = 5.5;

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

    @Override
    public void resize(double input) {
        this.side = this.side + (this.side*input/100);
    }
}
