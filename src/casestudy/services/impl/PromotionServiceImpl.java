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
            String[] arrayDaySplit;
            arrayDaySplit = elements.getBooking().getDayStart().split("/");
            if (year.contains(arrayDaySplit[2])) {
                System.out.println("Customer name: '" + elements.getNameCustomer()
                        + "' using '" + elements.getBooking().getServiceName()
                        + "' from '" + elements.getBooking().getDayStart()
                        + "' to '" + elements.getBooking().getDayEnd() + "'");
            }
        }
    }

    public void displayCustomerGetDiscount() {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getMonthValue());
        int month = localDate.getMonthValue();
        int year = localDate.getYear();
        for (Contract elements: contractList) {
            String[] arrayDaySplit;
            arrayDaySplit = elements.getBooking().getDayStart().split("/");
            if (month == Integer.parseInt(arrayDaySplit[1]) && year == Integer.parseInt(arrayDaySplit[2])) {
                voucherList.add(elements);
            }
        }
        int discount1;
        int discount2;
        int discount3;
        while (true){
            System.out.println("We have " + voucherList.size() + " voucher ");
            System.out.println("Enter the amount of 50% voucher: ");
            discount1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the amount of 20% voucher: ");
            discount2 = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the amount of 10% voucher: ");
            discount3 = Integer.parseInt(scanner.nextLine());
            if (discount1+discount2+discount3==voucherList.size()){
                break;
            }
            System.err.println("Wrong input please enter again!");
        }
        for (Contract contract : voucherList) {
            System.out.println(contract.toString());
        }
        for (int i = 0; i < discount1+discount2+discount3; i++) {

        }
    }

}
