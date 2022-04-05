package _05_access_modifier_static_methor_and_property.exercise.class_only_write;

public class Student {
    private String name = "John";
    private String classOfStudent = "C02";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassOfStudent(String classOfStudent) {
        this.classOfStudent = classOfStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classOfStudent='" + classOfStudent + '\'' +
                '}';
    }
}
