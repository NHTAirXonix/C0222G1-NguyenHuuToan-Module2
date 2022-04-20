package casestudy.models.person;

public class Customer extends Person{
    private int customerId;
    private String dayOfBirth;
    private String gender;
    private long identityNumber;
    private long phoneNumber;
    private String email;
    private String customerType;// Diamond, Platinum, Gold, Silver, Member

    public Customer() {

    }

    public Customer(int id,
                    String name,
                    int age,
                    String address,
                    int customerId,
                    String dayOfBirth,
                    String gender,
                    long identityNumber,
                    long phoneNumber,
                    String email,
                    String customerType) {
        super(id, name, age, address);
        this.customerId = customerId;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.identityNumber = identityNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getGender() {
        return gender;
    }



    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
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

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", address='" + super.getAddress() + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", identityNumber=" + identityNumber +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", customerType='" + customerType + '\'' +
                '}';
    }
}
