package casestudy.controllers;

import casestudy.services.impl.*;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        Scanner input = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("------Main--Menu------");
            System.out.println("1. Employee Menu");
            System.out.println("2. Customer Menu");
            System.out.println("3. Facility Menu");
            System.out.println("4. Booking Menu");
            System.out.println("5. Promotion Menu");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    displayEmployeeMenu();
                    break;
                case "2":
                    displayCustomerMenu();
                    break;
                case "3":
                    displayFacilityMenu();
                    break;
                case "4":
                    displayBookingMenu();
                    break;
                case "5":
                    displayPromotionMenu();
                    break;
                case "6":
                    check = false;
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }
    }

    //menu 1
    public static void displayEmployeeMenu() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        Scanner input = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("------Employee--Menu------");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Delete employee");
            System.out.println("5. Return main menu");
            System.out.println("Enter your choice: ");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    employeeService.display();
                    break;
                case "2":
                    employeeService.addNew();
                    break;
                case "3":
                    employeeService.edit();
                    break;
                case "4":
                    employeeService.delete();
                    break;
                case "5":
                    check = false;
                    break;
                default:
                    System.out.println("Wrong id");
                    break;
            }
        }

    }

    // menu 2
    public static void displayCustomerMenu() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        Scanner input = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("------Customer--Menu------");
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Delete customer");
            System.out.println("5. Return mainMenu");
            System.out.println("Enter your choice: ");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    customerService.display();
                    break;
                case "2":
                    customerService.addNew();
                    break;
                case "3":
                    customerService.edit();
                    break;
                case "4":
                    customerService.delete();
                    break;
                case "5":
                    check = false;
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }

    }

    // menu 3
    public static void displayFacilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        Scanner input = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("------Facility--Menu------");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main Menu");
            System.out.println("Enter your choice:");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    facilityService.display();
                    break;
                case "2":
                    displayAddNewFacilityMenu(facilityService);
                    break;
                case "3":
                    facilityService.displayMaintain();
                    break;
                case "4":
                    check = false;
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }
    }
    // super menu 3
    public static void displayAddNewFacilityMenu(FacilityServiceImpl facilityService) {
        Scanner input = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("------ADD-NEW-----");
            System.out.println("1. Add new Villa");
            System.out.println("2. Add new House");
            System.out.println("3. Add new Room");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    facilityService.addNewVilla();
                    break;
                case "2":
                    facilityService.addNewHouse();
                    break;
                case "3":
                    facilityService.addNewRoom();
                    break;
                case "4":
                    check =false;
                    break;
                default:
                    System.out.println("Wrong id");
                    break;
            }
        }

    }

    // menu con 4
    public static void displayBookingMenu() {
        BookingServiceImpl bookingService = new BookingServiceImpl();
        ContactServiceImpl contactService = new ContactServiceImpl();
        Scanner input = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("------Booking--Menu------");
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            System.out.println("Enter your choice: ");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    bookingService.addBooking();
                    break;
                case "2":
                    bookingService.displayListBooking();
                    break;
                case "3":
                    contactService.createNewContract();
                    break;
                case "4":
                    contactService.displayListContract();
                    break;
                case "5":

                    break;
                case "6":
                    check =false;
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }
    }

    //menu con 5
    public static void displayPromotionMenu() {
        PromotionServiceImpl promotionService = new PromotionServiceImpl();
        Scanner input = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("------Promotion--Menu------");
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Create new contracts");
            System.out.println("4. Return main menu");
            System.out.println("Enter your choice: ");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    promotionService.displayCustomerName();
                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":
                    check = false;
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }

        }

    }
}
