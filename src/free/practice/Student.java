package free.practice;

public class Student {
    private String name = "";
    private int age = 0;
    private String address = "";
    private double point = 0.0;

    public Student() {
    }

    public Student(String name, int age, String address, double point) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    /*public String[] toString(int count, String[] arrayinput) {
        if (count == 0) {
            String[] array1 = {"name='" + name + '\'' +
                    ", age=" + age +
                    ", address='" + address + '\'' +
                    ", point=" + point};
            return array1;
        } else {
            String[] array1 = new String[count + 1];
            for (int i = 0; i < count + 1; i++) {
                if (i == count) {
                    array1[i] = "name='" + name + '\'' +
                            ", age=" + age +
                            ", address='" + address + '\'' +
                            ", point=" + point;
                }
                array1[i] = arrayinput[i];
            }
            return array1;
        }
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", point=" + point +
                '}';
    }
}
