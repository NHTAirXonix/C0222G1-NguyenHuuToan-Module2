package casestudy.models.booking_contract;

public class Contract {
    private String id;
    private String deposit;
    private String allPrice;
    private final String customerName;
    private final String bookingDayStart;
    private final String bookingDayEnd;
    private final String bookingServiceName;
    private final String bookingDay;
    private final String bookingYear;


    public Contract(String id,
                    String bookingDay,
                    String bookingYear,
                    String bookingDayStart,
                    String bookingDayEnd,
                    String bookingServiceName,
                    String deposit,
                    String allPrice,
                    String customerName) {
        this.id = id;
        this.bookingDayEnd = bookingDayEnd;
        this.bookingDayStart = bookingDayStart;
        this.bookingServiceName = bookingServiceName;
        this.deposit = deposit;
        this.allPrice = allPrice;
        this.customerName = customerName;
        this.bookingDay = bookingDay;
        this.bookingYear = bookingYear;
    }

    public String getId() {
        return id;
    }

    public String getDeposit() {
        return deposit;
    }

    public String getAllPrice() {
        return allPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public void setAllPrice(String allPrice) {
        this.allPrice = allPrice;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameCustomer() {
        return this.customerName;
    }

    public String getBookingDayStart() {
        return bookingDayStart;
    }

    public String getBookingDayEnd() {
        return bookingDayEnd;
    }

    public String getBookingServiceName() {
        return bookingServiceName;
    }

    public String getBookingDay() {
        return bookingDay;
    }

    public String getBookingYear() {
        return bookingYear;
    }

    @Override
    public String toString() {
        return "\n---------------Contract-" + id + "--------------" +
                "\nidContract= " + id + '\'' +
                "| deposit= " + deposit + '\'' +
                "| allPrice= " + allPrice + '\'' +
                "\nCustomer name= " + customerName + "| Service name= " + bookingServiceName +
                "\nDay Start= " + bookingDayStart + "| Day End= " + bookingDayEnd;
    }
}
