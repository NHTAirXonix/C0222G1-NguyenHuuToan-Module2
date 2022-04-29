package casestudy.models.booking_contract;

public class Booking {
    private int bookingNumber;
    private String dayStart;
    private String dayEnd;
    private int customerNumber;
    private String customerInformation;
    private String facilityInformation;
    private String customerName;
    private String serviceName;
    private String serviceType;
    private boolean bookingStatus = false;


    public Booking(int bookingNumber,
                   String dayStart,
                   String dayEnd,
                   String customerInformation,
                   String facilityInformation,
                   String customerName,
                   String serviceName
    ) {


        this.bookingNumber = bookingNumber;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.customerInformation = customerInformation;
        this.facilityInformation = facilityInformation;
        this.customerName = customerName;
        this.serviceName = serviceName;

    }

    public boolean isBookingStatus() {
        return bookingStatus;
    }

    public String getCustomerInformation() {
        return customerInformation;
    }

    public String getFacilityInformation() {
        return facilityInformation;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setBookingStatus(boolean bookingStatus) {
        this.bookingStatus = bookingStatus;
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
        return "Booking {" +
                "bookingNumber= " + bookingNumber +
                "| dayStart= " + dayStart +
                "| dayEnd= " + dayEnd +
                "| customer name= " + getCustomerName() +
                "| facility name= " + getServiceName() +
                '}';
    }
}
