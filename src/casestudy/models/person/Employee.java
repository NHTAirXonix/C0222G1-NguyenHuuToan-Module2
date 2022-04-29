package casestudy.models.person;

public class Employee extends Person {
    private int employeeId;
    private String gender;
    private long phoneNumber;
    private String email;
    private String level;// chua xong
    private String position;//chua xong
    private long salary;

    public Employee() {
    }

    public Employee(int identityNumber,
                    String name,
                    String age,
                    String address,
                    int employeeId,
                    String gender,
                    long phoneNumber,
                    String email,
                    String level,
                    String position,
                    long salary) {
        super(identityNumber, name, age, address);
        this.employeeId = employeeId;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "identityNumber=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", employeeId= " + employeeId + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
