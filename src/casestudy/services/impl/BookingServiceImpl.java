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
        customerList.add(new Customer(1, "Hao", 20, "Ben xe Da Nang", 10, "13/10/1999", "Male",
                123321123, 123123123, "hao@gmail.com", "Diamond"));
        customerList.add(new Customer(2, "Hoang", 24, "Ben xe Da Nang", 11, "13/10/1995", "Male",
                123321123, 123123123, "hoang@gmail.com", "Platinum"));
        facilityIntegerMap.put(new Villa("Villa 1", 200,2000000, 10, "week", "VIP",
                25, 2), 0);
        facilityIntegerMap.put(new Villa("Villa 2", 100,1000000, 50, "day", "NORMAL",
                25, 2), 0);
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
        int id =1;
        if (!bookingSet.isEmpty()){
            id = bookingSet.size();
        }
    }

    @Override
    public void displayListBooking() {

    }
    public static Customer chooseCustomer(){
        System.out.println("Customer list: ");
        for (Customer customer: customerList ){
            System.out.println(customer.toString());
        }
        System.out.println("Enter the id of customer");
        boolean check = true;
        int id = Integer.parseInt(scanner.nextLine());
        while (check){
            System.out.println("Enter the id of customer");
            for (Customer customer: customerList){
                if (id == customer.getCustomerId()){
                    check= false;
                    return customer;
                }
            }
            if (check){
                System.out.println("Please input the id again:");
                id = Integer.parseInt(scanner.nextLine());
            }
        }
        return null;
    }
}
