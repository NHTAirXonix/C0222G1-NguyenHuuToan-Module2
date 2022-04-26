package casestudy.services.impl;

import casestudy.models.person.Customer;
import casestudy.regex_class.CustomerRegex;
import casestudy.services.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static final List<Customer> customerList = new LinkedList<>();
    private static final Scanner scanner = new Scanner(System.in);

    static {
        customerList.add(new Customer(11231256, "Hao", "20/02/1995", "Ben xe Da Nang", 1, "Male", 123123123, "hao@gmail.com", "Diamond"));
        customerList.add(new Customer(21232133, "Hoang", "24/04/1999", "Son Tra", 2, "Male", 297496635, "hoang@gmail.com", "Platinum"));
    }

    public static List<Customer> getCustomerList() {
        return customerList;
    }

    @Override
    public void display() {
        for (Customer elements : customerList) {
            System.out.println(elements.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Enter the id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        String age = CustomerRegex.regexAge();
        System.out.println("Enter the address");
        String address = scanner.nextLine();
        System.out.println("Enter the customer id: ");
        int customerId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the service name: ");
        String dayOfBirth = scanner.nextLine();
        System.out.println("Enter the gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter the phone number: ");
        long phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the email: ");
        String email = scanner.nextLine();
        StringBuilder customerType = CustomerRegex.customerType();
        Customer customer = new Customer(id, name, age, address, customerId, gender, phoneNumber, email, customerType.toString());
        customerList.add(customer);
        System.out.println("Add complete");
    }

    @Override
    public void edit() {
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

                System.out.println("Edit complete");
            } else if (i == customerList.size()-1){
                System.out.println("Wrong id");
            }
        }
    }

    @Override
    public void delete() {
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
    }
}
