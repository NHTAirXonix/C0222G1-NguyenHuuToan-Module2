package casestudy.controllers;

import casestudy.services.impl.EmployeeServiceImpl;

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
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomerManagement();
                    break;
                case 3:
                    displayFacilityManagement();
                    break;
                case 4:
                    displayBookingManagerment();
                    break;
                case 5:
                    displayPromotionManager();
                case 6:
                    check = false;
                    break;
            }
        }
    }

    //menu con 1
    public static void displayEmployeeMenu() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        Scanner input = new Scanner(System.in);
        System.out.println("------Employee--Menu------");
        System.out.println("1. Display list employees");
        System.out.println("2. Add new employee");
        System.out.println("3. Edit employee");
        System.out.println("4. Return main menu");
        System.out.println("Enter your choice: ");
        int choice = Integer.parseInt(input.nextLine());
        switch (choice) {
            case 1:
                employeeService.display();
                break;
            case 2:
                employeeService.addNew();
                break;
            case 3:
                break;
            case 4:
                displayMainMenu();
                break;
        }
    }

    // menu con 2
    public static void displayCustomerManagement() {
        Scanner input = new Scanner(System.in);
        System.out.println("------Customer--Menu------");
        System.out.println("1. Display list customers");
        System.out.println("2. Add new customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Return main menu");
        System.out.println("Enter your choice: ");
        int choice = Integer.parseInt(input.nextLine());
        switch (choice) {
            case 1:
                displayEmployeeMenu();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                displayMainMenu();
                break;
        }
    }

    // menu con 3
    public static void displayFacilityManagement() {
        Scanner input = new Scanner(System.in);
        System.out.println("------Facility--Menu------");
        System.out.println("1. Display list facility");
        System.out.println("2. Add new facility");
        System.out.println("3. Display list facility maintenance");
        System.out.println("4. Return main menu");
        System.out.println("Enter your choice: ");
        int choice = Integer.parseInt(input.nextLine());
        switch (choice) {
            case 1:
                displayEmployeeMenu();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                displayMainMenu();
                break;
        }
    }

    // menu con 4
    public static void displayBookingManagerment() {
        Scanner input = new Scanner(System.in);
        System.out.println("------Booking--Menu------");
        System.out.println("1. Add new booking");
        System.out.println("2. Display list booking");
        System.out.println("3. Create new contracts");
        System.out.println("4. Display list contracts");
        System.out.println("5. Edit contracts");
        System.out.println("6. Return main menu");
        System.out.println("Enter your choice: ");
        int choice = Integer.parseInt(input.nextLine());
        switch (choice) {
            case 1:
                displayEmployeeMenu();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                displayMainMenu();
                break;
        }
    }

    //menu con 5
    public static void displayPromotionManager() {
        Scanner input = new Scanner(System.in);
        System.out.println("------Promotion--Menu------");
        System.out.println("1. Display list customers use service");
        System.out.println("2. Display list customers get voucher");
        System.out.println("3. Create new contracts");
        System.out.println("4. Return main menu");
        System.out.println("Enter your choice: ");
        int choice = Integer.parseInt(input.nextLine());
        switch (choice) {
            case 1:
                displayEmployeeMenu();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                displayMainMenu();
                break;
        }
    }
}
