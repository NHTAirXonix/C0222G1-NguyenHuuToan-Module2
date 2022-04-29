package casestudy.services.impl;

import casestudy.models.booking_contract.Booking;
import casestudy.models.booking_contract.Contract;
import casestudy.services.ContactService;
import casestudy.utils.ReadAndWrite;

import java.io.IOException;
import java.util.*;

public class ContactServiceImpl implements ContactService {
    static List<Contract> contractList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet;

    static {
        try {
            bookingSet = BookingServiceImpl.getBookingSet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    Queue<Booking> bookingQueue = new LinkedList<>();

    public void createNewContract() throws IOException {
        for (Booking elements : bookingSet) {
            if (!elements.isBookingStatus()) {
                bookingQueue.add(elements);
                elements.setBookingStatus(true);
            }
        }
        if (bookingQueue.isEmpty()) {
            System.out.println("All contract is created");
        } else {
            while (!bookingQueue.isEmpty()) {
                Booking booking = bookingQueue.poll();
                System.out.println("----------Contract-information-loading----------");
                System.out.println("Booking information: " + booking.toString());
                System.out.println("Customer information: " + booking.getCustomerInformation());
                System.out.println("Enter the id for contract");
                String id = scanner.nextLine();
                System.out.println("Enter the deposit price: ");
                String deposit = scanner.nextLine();
                System.out.println("Enter the deposit price: ");
                String allPrice = scanner.nextLine();
                String[] arrayDaySplit;
                arrayDaySplit = booking.getDayStart().split("/");
                Contract contract = new Contract(id, arrayDaySplit[1], arrayDaySplit[2], booking.getDayStart(), booking.getDayEnd(), booking.getServiceName(), deposit, allPrice, booking.getCustomerName());
                String line = id+","+arrayDaySplit[1]+","+arrayDaySplit[2]+","+ booking.getDayStart()+","+ booking.getDayEnd()+","+ booking.getServiceName()+","+ deposit+","+ allPrice+","+ booking.getCustomerName();
                System.out.println(line);
                contractList.add(contract);
                ReadAndWrite.writeFileContract(line);
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
