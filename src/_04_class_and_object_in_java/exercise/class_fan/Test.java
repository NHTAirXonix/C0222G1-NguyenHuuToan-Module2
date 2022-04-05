package _04_class_and_object_in_java.exercise.class_fan;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ClassFan fan1 = new ClassFan();
        ClassFan fan2 = new ClassFan();

        int speed1 = 0;
        while (speed1 < 1 || speed1 > 3) {
            System.out.println("Enter the speed Fan1 (from 1 to 3):");
            speed1 = input.nextInt();
            if (speed1 > 0 && speed1 < 4) {
                fan1.setSpeed(speed1);
            }
        }
        System.out.println("Enter the radius Fan1:");
        double radius1 = input.nextDouble();
        fan1.setRadius(radius1);
        input.nextLine();
        System.out.println("Enter the color Fan1:");
        String color1 = input.nextLine();
        fan1.setColor(color1);
        String status1 = "";
        while (!status1.equals("off") && !status1.equals("on")) {
            System.out.println("Enter the status of Fan1 ('on' or 'off'):");
            status1 = input.nextLine();
            if (status1.equals("off")) {
                fan1.setStatus(status1);
            }
            if (status1.equals("on")) {
                fan1.setStatus(status1);
            }
        }

        int speed2 = 0;
        while (speed2 < 1 || speed2 > 3) {
            System.out.println("Enter the speed Fan2 (from 1 to 3):");
            speed2 = input.nextInt();
            if (speed2 > 0 && speed2 < 4) {
                fan2.setSpeed(speed2);
            }
        }
        System.out.println("Enter the radius Fan2:");
        double radius2 = input.nextDouble();
        fan2.setRadius(radius2);
        input.nextLine();
        System.out.println("Enter the color Fan2:");
        String color2 = input.nextLine();
        fan2.setColor(color2);
        String status2 = "";
        while (!status2.equals("off") && !status2.equals("on")) {
            System.out.println("Enter the status of Fan2 ('on' or 'off'):");
            status2 = input.nextLine();
            if (status2.equals("off")) {
                fan2.setStatus(status2);
            }
            if (status2.equals("on")) {
                fan2.setStatus(status2);
            }
        }

        String result1 = fan1.toString();
        System.out.println("------FAN1------\n" + result1);
        String result2 = fan2.toString();
        System.out.println("------FAN2------\n" + result2);
    }
}
