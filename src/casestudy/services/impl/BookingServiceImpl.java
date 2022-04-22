package casestudy.services.impl;

import casestudy.models.booking_contract.Booking;
import casestudy.models.facility.Facility;
import casestudy.models.facility.Villa;
import casestudy.models.person.Customer;
import casestudy.services.BookingService;
import casestudy.utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    private static final Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static {
        customerList.add(new Customer(11231256, "Hao", 20, "Ben xe Da Nang", 10, "Male", 123123123, "hao@gmail.com", "Diamond"));
        customerList.add(new Customer(21232133, "Hoang", 24, "Son Tra", 11, "Male", 297496635, "hoang@gmail.com", "Platinum"));
        facilityIntegerMap.put(new Villa("1", "Villa 1", 200, 2000000, 10, "week", "VIP", 25, 2), 0);
        facilityIntegerMap.put(new Villa("2", "Villa 2", 100, 1000000, 50, "day", "NORMAL", 25, 2), 0);
    }

    public Set<Booking> sentBooking(){
        return bookingSet;
    }

    @Override
    public void display() {

    }

    @Override
    public void addNew() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void addBooking() {
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("Enter start day:");
        String startDay = scanner.nextLine();
        System.out.println("Enter end day:");
        String endDay = scanner.nextLine();
        Booking booking = new Booking(id,startDay,endDay,customer,facility);
        bookingSet.add(booking);
        System.out.println("Add booking complete!");
    }

    @Override
    public void displayListBooking() {
        for (Booking booking : bookingSet) {
            System.out.println(booking.toString());
        }
    }

    public static Customer chooseCustomer() {
        System.out.println("Customer list: ");
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
        System.out.println("Enter the id of customer");
        boolean check = true;
        int id = Integer.parseInt(scanner.nextLine());
        while (check) {
            System.out.println("Enter the id of customer");
            for (Customer customer : customerList) {
                if (id == customer.getCustomerId()) {
                    check = false;
                    return customer;
                }
            }
            if (check) {
                System.out.println("Invalid id, please input the id again:");
                id = Integer.parseInt(scanner.nextLine());
            }
        }
        return null;
    }

    public static Facility chooseFacility() {
        System.out.println("Facility list: ");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey().toString());
        }

        System.out.println("Enter the id of facility");
        boolean check = true;
        String id = scanner.nextLine();

        while (check) {
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (id.equals(entry.getKey().getFacilityId())) {
                    check = false;
                    return entry.getKey();
                }
            }
            if (check) {
                System.out.println("Invalid id, please input the id again:");
                id = scanner.nextLine();
            }
        }
        return null;
    }
}
