package casestudy.models.person;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private int customerId;
    private String gender;
    private long phoneNumber;
    private String email;
    private String customerType;
    private static final List<Integer> discountList = new ArrayList<>();
    private boolean discountStatus = false;

    public Customer() {
    }

    public Customer(int identityNumber,
                    String name,
                    String age,
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

    public void addDiscount(int percent) {
        discountList.add(percent);
    }

    public static List<Integer> getDiscountList() {
        return discountList;
    }

    public boolean isDiscountStatus() {
        return discountStatus;
    }

    public void setDiscountStatus(boolean discountStatus) {
        this.discountStatus = discountStatus;
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
