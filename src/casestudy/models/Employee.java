package casestudy.models;

public class Employee extends Person{
    private int employeeId;
    private String dayOfBirth;
    private boolean gender;
    private long identityNumber;
    private long phoneNumber;
    private String email;
    private String level;// chua xong
    private String position;//chua xong
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, int age, String address, int employeeId, String dayOfBirth, boolean gender, long identityNumber, long phoneNumber, String email, String level, String position, int salary) {
        super(id, name, age, address);
        this.employeeId = employeeId;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.identityNumber = identityNumber;
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

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public long getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(long identityNumber) {
        this.identityNumber = identityNumber;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
