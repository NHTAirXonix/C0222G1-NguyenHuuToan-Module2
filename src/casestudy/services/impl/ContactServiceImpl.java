package casestudy.services.impl;

import casestudy.models.booking_contract.Booking;
import casestudy.models.booking_contract.Contract;
import casestudy.models.person.Customer;
import casestudy.services.ContactService;

import java.util.*;

public class ContactServiceImpl implements ContactService {
    static List<Contract> contractList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public void createNewContract() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sentBooking();
        for (Booking booking : bookingSet){
            bookingQueue.add(booking);
        }
        while (!bookingQueue.isEmpty()){
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomer();
            System.out.println("Detail of booking information for contact: "+ booking.toString());
            System.out.println("Detail of customer for contract: "+ customer.toString());
            System.out.println("Enter the id for contract");
            String id = scanner.nextLine();
            System.out.println("Enter the deposit price: ");
            String deposit = scanner.nextLine();
            System.out.println("Enter the deposit price: ");
            String allPrice = scanner.nextLine();

            Contract contract = new Contract(id,booking,deposit,allPrice,customer);
            contractList.add(contract);
            System.out.println("Create contract complete" + contract.toString());
        }


    }

    
    public void displayListContract() {
        for (Contract contract: contractList) {
            System.out.println(contract.toString());
        }
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
