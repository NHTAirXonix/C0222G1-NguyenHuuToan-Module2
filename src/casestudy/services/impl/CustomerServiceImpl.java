package casestudy.services.impl;


import casestudy.utils.ReadAndWrite;
import casestudy.models.person.Customer;
import casestudy.regex_class.CustomerRegex;
import casestudy.services.CustomerService;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static List<Customer> getCustomerList() {
        return customerList;
    }

    @Override
    public void display() throws IOException {
        customerList = ReadAndWrite.readFileCustomer();
        for (Customer elements : customerList) {
            System.out.println(elements.toString());
        }
    }

    @Override
    public void addNew() throws IOException {
        System.out.println("Enter the id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        String age = CustomerRegex.regexAge();
        System.out.println("Enter the address");
        String address = scanner.nextLine();
        System.out.println("Enter the customer id: ");
        int customerId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter the phone number: ");
        long phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the email: ");
        String email = scanner.nextLine();
        StringBuilder customerType = CustomerRegex.customerType();
        String line = id + "," + name + "," + age + "," + address + "," + customerId + "," + gender + "," + phoneNumber + "," + email + "," + customerType.toString();
        ReadAndWrite.writeFileCustomer(line);
        System.out.println("Add complete");
    }

    @Override
    public void edit() throws IOException {
        customerList = ReadAndWrite.readFileCustomer();
        System.out.println("Enter the id of customer your want to edit: ");
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomerId() == input) {
                System.out.println("Enter the id: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter the name: ");
                String name = scanner.nextLine();
                String age = CustomerRegex.regexAge();
                System.out.println("Enter the address");
                String address = scanner.nextLine();
                System.out.println("Enter the customer id: ");
                int customerId = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter the gender: ");
                String gender = scanner.nextLine();
                System.out.println("Enter the phone number: ");
                long phoneNumber = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter the email: ");
                String email = scanner.nextLine();
                StringBuilder customerType = CustomerRegex.customerType();

                customerList.get(i).setId(id);
                customerList.get(i).setName(name);
                customerList.get(i).setAge(age);
                customerList.get(i).setAddress(address);
                customerList.get(i).setCustomerId(customerId);
                customerList.get(i).setGender(gender);
                customerList.get(i).setPhoneNumber(phoneNumber);
                customerList.get(i).setEmail(email);
                customerList.get(i).setCustomerType(customerType.toString());

                File file = new File("D:\\CODEGYM\\C0222G1_Nguyen_Huu_Toan_Module2\\src\\casestudy\\data\\customer.csv");
                file.delete();
                for (Customer elements : customerList) {
                    String line = elements.getId() + "," +
                            elements.getName() + "," +
                            elements.getAge() + "," +
                            elements.getAddress() + "," +
                            elements.getCustomerId() + "," +
                            elements.getGender() + "," +
                            elements.getPhoneNumber() + "," +
                            elements.getEmail() + "," +
                            elements.getCustomerType();
                    ReadAndWrite.writeFileCustomer(line);
                }
                System.out.println("Edit complete");
                break;
            } else if (i == customerList.size() - 1) {
                System.out.println("Wrong id");
            }
        }

    }

    @Override
    public void delete() throws IOException {
        customerList = ReadAndWrite.readFileCustomer();
        System.out.println("Enter the id of customer you want to delete: ");
        int input = scanner.nextInt();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomerId() == input) {
                customerList.remove(i);
                System.out.println("Delete complete");
                break;
            }
            if (i == customerList.size() - 1) {
                System.out.println("Wrong id");
            }
        }
        File file = new File("D:\\CODEGYM\\C0222G1_Nguyen_Huu_Toan_Module2\\src\\casestudy\\data\\customer.csv");
        file.delete();
        for (Customer elements : customerList) {
            String line = elements.getId() + "," +
                    elements.getName() + "," +
                    elements.getAge() + "," +
                    elements.getAddress() + "," +
                    elements.getCustomerId() + "," +
                    elements.getGender() + "," +
                    elements.getPhoneNumber() + "," +
                    elements.getEmail() + "," +
                    elements.getCustomerType();
            ReadAndWrite.writeFileCustomer(line);
        }
    }
}
