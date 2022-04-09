package free.practice;

public class Student extends Person {
    private int point = 0;

    public Student(int point) {
        this.point = point;
    }

    public Student(String name, int age, boolean gender, int point) {
        super(name, age, gender);
        this.point = point;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + isGender() +
                ", point=" + point +
                '}';
    }
}
