package _06_inheritance.exercise.point_and_moveablepoint;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(4.5f, 5.5f);
        MoveablePoint moveablePoint = new MoveablePoint(4.5f, 5.5f, 3.5f, 4.5f);


        System.out.println("Check class point");
        System.out.println(point.toString());
        System.out.println("Class point change X, Y");
        point.setXY(5.5f, 6.5f);
        System.out.println(point.toString());

        System.out.println("Check class moveablepoint");
        System.out.println(moveablePoint.toString());
        System.out.println("Class moveablepoint change X, Y");
        moveablePoint.setXY(5.5f, 6.5f);
        System.out.println(moveablePoint.toString());
        System.out.println("Class moveablepoint change Xspeed, Yspeed");
        moveablePoint.setSpeed(5.0f, 6.0f);
        System.out.println(moveablePoint.toString());
        System.out.println("Class moveablepoint change call method move()");
        moveablePoint.move();
        System.out.println(moveablePoint.toString());
    }
}
