package _05_access_modifier_static_methor_and_property.exercise.class_only_write;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student person1 = new Student();
        System.out.println("Enter the name of student: ");
        String name = input.nextLine();
        person1.setName(name);
        System.out.println("Enter the class of student: ");
        String classStudent = input.nextLine();
        person1.setClassOfStudent(classStudent);
        String result = person1.toString();
        System.out.println(result);
    }
}
