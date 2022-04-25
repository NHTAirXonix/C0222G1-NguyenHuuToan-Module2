package casestudy.services.impl;


import casestudy.models.booking_contract.Contract;

import java.util.List;

public class PromotionServiceImpl {
    static List<Contract> contractList = ContactServiceImpl.getContractList();

    public void displayCustomerName() {
        for (Contract elements : contractList) {
            System.out.println("Customer name: '" + elements.getNameCustomer()
                    + "' using '" + elements.getBooking().getServiceName()
                    + "' from '" + elements.getBooking().getDayStart()
                    + "' to '" + elements.getBooking().getDayEnd()+ "'");
        }
    }


}
