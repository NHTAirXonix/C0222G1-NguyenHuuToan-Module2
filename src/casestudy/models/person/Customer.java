package casestudy.models.person;

public class Customer extends Person{
    private int customerId;
    private String gender;
    private long phoneNumber;
    private String email;
    private String customerType;// Diamond, Platinum, Gold, Silver, Member

    public Customer() {

    }

    public Customer(int identityNumber,
                    String name,
                    int age,
                    String address,
                    int customerId,
                    String gender,
                    long phoneNumber,
                    String email,
                    String customerType) {
        super(identityNumber, name, age, address);
        this.customerId = customerId;
        this.gender = gender;
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

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "identityNumber=" + super.getId() +
                ", customer id=" + customerId +
                ", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", address='" + super.getAddress() + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", customerType='" + customerType + '\'' +
                '}';
    }
}
