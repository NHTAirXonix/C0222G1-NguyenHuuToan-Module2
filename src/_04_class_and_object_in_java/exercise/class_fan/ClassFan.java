package _04_class_and_object_in_java.exercise.class_fan;

public class ClassFan {

    static final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = true;
    private double radius = 5;
    private String color = "blue";

    public ClassFan() {
    }

    public ClassFan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int input) {
        if (input == 1) {
            speed = SLOW;
        } else if (input == 2) {
            speed = MEDIUM;
        } else {
            speed = FAST;
        }
    }

    public String getStatus() {
        if (!on) {
            return "Off";
        } else {
            return "On";
        }
    }

    public void setStatus(String input) {
        if (input.equals("on")) {
            on = true;
        }
        if (input.equals("off")) {
            on = false;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double input) {
        radius = input;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String input) {
        color = input;
    }

    public String toString() {
        if (on) {
            return "Status: on\nSpeed: " + speed + "\nColor: " + color + "\nRadius: " + radius + "\n";
        } else {
            return "Status: off\nColor: " + color + "\nRadius: " + radius + "\n";
        }

    }
}

