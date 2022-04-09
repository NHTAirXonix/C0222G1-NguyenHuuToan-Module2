package casestudy.models;

public class Customer extends Person{
    private int bookingNumber;
    private String dayStart;
    private String dayEnd;
    private int customerNumber;
    private String serviceName;
    private String serviceType;
    private String dayOfBirth;
    private boolean gender;
    private long identityNumber;
    private long phoneNumber;
    private String email;
    private String customerType;// Diamond, Platinum, Gold, Silver, Member

    public Customer() {

    }

    public Customer(int id, String name, int age, String address, int bookingNumber, String dayStart, String dayEnd, int customerNumber, String serviceName, String serviceType, String dayOfBirth, boolean gender, long identityNumber, long phoneNumber, String email, String customerType) {
        super(id, name, age, address);
        this.bookingNumber = bookingNumber;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.customerNumber = customerNumber;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.identityNumber = identityNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
    }

    public int getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(int bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
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

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
}
