package casestudy.services.impl;

import casestudy.models.booking_contract.Booking;
import casestudy.models.facility.Facility;
import casestudy.models.facility.House;
import casestudy.models.facility.Villa;
import casestudy.models.person.Customer;
import casestudy.services.BookingService;
import casestudy.utils.BookingComparator;
import casestudy.utils.ReadAndWrite;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class BookingServiceImpl implements BookingService {
    private static final Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();


    public static Set<Booking> getBookingSet() throws IOException {
        return bookingSet = ReadAndWrite.readFileBooking();
    }

    public static void setBookingSet(Set<Booking> bookingSet) {
        BookingServiceImpl.bookingSet = bookingSet;
    }

    public Set<Booking> sentBooking() {
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
    public void addBooking() throws IOException {
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
        Booking booking = new Booking(id, startDay, endDay, customer.toString(), facility.toString(), customer.getName(), facility.getServiceName());
        String line = id + "," + startDay + "," + endDay + "," + customer.toString() + "," + facility.toString() + "," + customer.getName() + "," + facility.getServiceName();
        System.out.println(line);
        ReadAndWrite.writeFileBooking(line);
        bookingSet.add(booking);
        System.out.println("Add booking complete!");
    }

    @Override
    public void displayListBooking() throws IOException {
        bookingSet = ReadAndWrite.readFileBooking();
        for (Booking booking : bookingSet) {
            System.out.println(booking.toString());
        }
    }

    public static Customer chooseCustomer() throws IOException {
        customerList = ReadAndWrite.readFileCustomer();
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

    public static Facility chooseFacility() throws IOException {
        facilityIntegerMap = ReadAndWrite.readFileFacility();
        System.out.println("Facility list: ");
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        facilityService.display();
        System.out.println("Enter the id of facility");
        String id = scanner.nextLine();
        int output = 0;
        while (true) {
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                output = 1;
                if (id.equals(entry.getKey().getFacilityId())) {
                    output = 2;
                    if (entry.getValue() < 5) {
                        entry.setValue(entry.getValue() + 1);
                        File file = new File("D:\\CODEGYM\\C0222G1_Nguyen_Huu_Toan_Module2\\src\\casestudy\\data\\facility.csv");
                        file.delete();
                        for (Map.Entry<Facility, Integer> elements : facilityIntegerMap.entrySet()) {
                            String[] check = elements.getKey().getFacilityId().split("-");
                            if (check[0].equals("SVVL")) {
                                String line = elements.getKey().getFacilityId() + "," +
                                        elements.getKey().getServiceName() + "," +
                                        elements.getKey().getUseArea() + "," +
                                        elements.getKey().getRentPrice() + "," +
                                        elements.getKey().getMaximumPeople() + "," +
                                        elements.getKey().getRentType() + "," +
                                        ((Villa) elements.getKey()).getRoomStandard() + "," +
                                        ((Villa) elements.getKey()).getPoolArea() + "," +
                                        ((Villa) elements.getKey()).getFloor() + "," +
                                        elements.getValue();
                                System.out.println(line);
                                ReadAndWrite.writeFileFacility(line);
                            } else if (check[0].equals("SVHO")) {
                                String line = elements.getKey().getFacilityId() + "," +
                                        elements.getKey().getServiceName() + "," +
                                        elements.getKey().getUseArea() + "," +
                                        elements.getKey().getRentPrice() + "," +
                                        elements.getKey().getMaximumPeople() + "," +
                                        elements.getKey().getRentType() + "," +
                                        ((House) elements.getKey()).getRoomStandard() + "," +
                                        ((House) elements.getKey()).getFloor() + "," +
                                        elements.getValue();
                                System.out.println(line);
                                ReadAndWrite.writeFileFacility(line);
                            } else {
                                String line = elements.getKey().getFacilityId() + "," +
                                        elements.getKey().getServiceName() + "," +
                                        elements.getKey().getUseArea() + "," +
                                        elements.getKey().getRentPrice() + "," +
                                        elements.getKey().getMaximumPeople() + "," +
                                        elements.getKey().getRentType() + "," +
                                        elements.getValue();
                                System.out.println(line);
                                ReadAndWrite.writeFileFacility(line);
                            }
                        }
                        return entry.getKey();
                    }
                }
            }
            if (output == 1) {
                System.out.println("Invalid id, please input the id again:");
            } else {
                System.out.println("This facility is close for maintenance, please input the id again ");
            }
        }
    }
}
