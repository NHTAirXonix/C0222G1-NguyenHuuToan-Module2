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
                String line = id + "," + arrayDaySplit[1] + "," + arrayDaySplit[2] + "," + booking.getDayStart() + "," + booking.getDayEnd() + "," + booking.getServiceName() + "," + deposit + "," + allPrice + "," + booking.getCustomerName();
                System.out.println(line);
                contractList.add(contract);
                ReadAndWrite.writeAllFile("D:\\CODEGYM\\C0222G1_Nguyen_Huu_Toan_Module2\\src\\casestudy\\data\\contract.csv", line);
                System.out.println("Create contract complete" + contract.toString());
            }
        }
        rewriteContractFile();
    }

    public void editContract() throws IOException {
        String idFind;
        boolean check = true;
        while (true) {
            System.out.println("Enter the id of contract you want to edit");
            idFind = scanner.nextLine();
            for (Contract contracts : contractList) {
                if (contracts.getId().equals(idFind)) {
                    System.out.println("Enter the id for contract");
                    String id = scanner.nextLine();
                    System.out.println("Enter the deposit price: ");
                    String deposit = scanner.nextLine();
                    System.out.println("Enter the deposit price: ");
                    String allPrice = scanner.nextLine();
                    contracts.setId(id);
                    contracts.setAllPrice(allPrice);
                    contracts.setDeposit(deposit);
                    check = false;
                    rewriteContractFile();
                    break;
                }
            }
            if (check) {
                System.out.println("Your input is not appear in contract list, please re-enter");
            }
        }
    }

    public static void rewriteContractFile() throws IOException {
        for (Contract contract : contractList) {
            String line = contract.getId() + "," + contract.getBookingDay() + "," + contract.getBookingYear() + "," + contract.getBookingDayStart() + "," + contract.getBookingDayEnd() + "," + contract.getBookingServiceName() + "," + contract.getDeposit() + "," + contract.getAllPrice() + "," + contract.getCustomerName();
            ReadAndWrite.writeAllFile("D:\\CODEGYM\\C0222G1_Nguyen_Huu_Toan_Module2\\src\\casestudy\\data\\contract.csv", line);
        }
    }

    public void displayListContract() throws IOException {
        contractList = ReadAndWrite.readFileContract();
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
}
