package casestudy.services.impl;

import casestudy.models.booking_contract.Booking;
import casestudy.models.booking_contract.Contract;
import casestudy.models.person.Customer;
import casestudy.services.ContactService;

import java.util.*;

public class ContactServiceImpl implements ContactService {
    static List<Contract> contractList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet = BookingServiceImpl.getBookingSet();
    Queue<Booking> bookingQueue = new LinkedList<>();

    public void createNewContract() {
        for (Booking elements: bookingSet) {
            if (!elements.isBookingStatus()){
                bookingQueue.add(elements);
                elements.setBookingStatus(true);
            }
        }
        if (bookingQueue.isEmpty()) {
            System.out.println("All contract is created");
        } else {
            while (!bookingQueue.isEmpty()) {
                Booking booking = bookingQueue.poll();
                Customer customer = booking.getCustomer();
                System.out.println("----------Contract-information-loading----------");
                System.out.println("Booking information: " + booking.toString());
                System.out.println("Customer information: " + customer.toString());
                System.out.println("Enter the id for contract");
                String id = scanner.nextLine();
                System.out.println("Enter the deposit price: ");
                String deposit = scanner.nextLine();
                System.out.println("Enter the deposit price: ");
                String allPrice = scanner.nextLine();
                Contract contract = new Contract(id, booking, deposit, allPrice, customer);
                contractList.add(contract);
                System.out.println("Create contract complete" + contract.toString());
            }
        }
    }


    public void displayListContract() {
        for (Contract contract : contractList) {
            System.out.println(contract.toString());
        }
    }

    public static List<Contract> getContractList() {
        return contractList;
    }

    public static void setContractList(List<Contract> contractList) {
        ContactServiceImpl.contractList = contractList;
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
}
