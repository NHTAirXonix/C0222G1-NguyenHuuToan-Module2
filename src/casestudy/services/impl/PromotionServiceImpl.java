package casestudy.services.impl;

import casestudy.models.booking_contract.Contract;

import java.time.LocalDate;
import java.util.*;

public class PromotionServiceImpl {
    static List<Contract> contractList = ContactServiceImpl.getContractList();
    static Scanner scanner = new Scanner(System.in);
    List<Contract> voucherList = new ArrayList<>();

    public void displayCustomerUseService() {
        System.out.println("Enter the year of customer using facility list: ");
        String year = scanner.nextLine();
        for (Contract elements : contractList) {
            if (year.contains(elements.getBookingYear())) {
                System.out.println("Customer name: '" + elements.getNameCustomer()
                        + "' using '" + elements.getBookingServiceName()
                        + "' from '" + elements.getBookingDayStart()
                        + "' to '" + elements.getBookingDayEnd() + "'");
            }
        }
    }

    public void displayCustomerGetDiscount() {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getMonthValue());
        int month = localDate.getMonthValue();
        int year = localDate.getYear();
        for (Contract elements: contractList) {
            if (month == Integer.parseInt(elements.getBookingDay()) && year == Integer.parseInt(elements.getBookingYear())) {
                voucherList.add(elements);
            }
        }
        int discount50;
        int discount20;
        int discount10;
        while (true){
            System.out.println("We have " + voucherList.size() + " voucher ");
            System.out.println("Enter the amount of 50% voucher: ");
            discount50 = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the amount of 20% voucher: ");
            discount20 = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the amount of 10% voucher: ");
            discount10 = Integer.parseInt(scanner.nextLine());
            if (discount50+discount20+discount10==voucherList.size()){
                break;
            }
            System.err.println("Wrong input please enter again!");
        }
        for (Contract contract : voucherList) {
            System.out.println(contract.toString());
        }
        for (int i = 0; i < discount50+discount20+discount10; i++) {

        }
    }

}
