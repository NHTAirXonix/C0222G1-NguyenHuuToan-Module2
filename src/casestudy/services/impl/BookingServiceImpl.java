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
    static List<Customer> customerList = CustomerServiceImpl.getCustomerList();
    static Map<Facility, Integer> facilityIntegerMap = FacilityServiceImpl.getFacilityIntegerMap();



    public static Set<Booking> getBookingSet() {
        return bookingSet;
    }

    public static void setBookingSet(Set<Booking> bookingSet) {
        BookingServiceImpl.bookingSet = bookingSet;
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
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        System.out.println("Customer list: ");
        customerService.display();
        System.out.println("Enter the id of customer");
        boolean check = true;
        int id = Integer.parseInt(scanner.nextLine());
        while (check) {
            System.out.println("Enter the id of customer");
            for (Customer customer : customerList) {
                if (id == customer.getCustomerId()) {
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
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        facilityService.display();
        System.out.println("Enter the id of facility");
        String id = scanner.nextLine();
        while (true) {
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (id.equals(entry.getKey().getFacilityId())) {
                    entry.setValue(entry.getValue()+1);
                    return entry.getKey();
                }
            }
            if (true) {
                System.out.println("Invalid id, please input the id again:");
                id = scanner.nextLine();
            }
        }
    }
}
