package casestudy.models.booking_contract;

public class Booking {
    private int bookingNumber;
    private String dayStart;
    private String dayEnd;
    private int customerNumber;
    private String serviceName;
    private String serviceType;


    public Booking(int bookingNumber, String dayStart, String dayEnd, int customerNumber, String serviceName, String serviceType) {
        this.bookingNumber = bookingNumber;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.customerNumber = customerNumber;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
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

    @Override
    public String toString() {
        return "Booking{" +
                "bookingNumber=" + bookingNumber +
                ", dayStart='" + dayStart + '\'' +
                ", dayEnd='" + dayEnd + '\'' +
                ", customerNumber=" + customerNumber +
                ", serviceName='" + serviceName + '\'' +
                ", serviceType='" + serviceType + '\'' +
                '}';
    }
}
