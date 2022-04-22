package casestudy.services.impl;

import casestudy.models.person.Customer;
import casestudy.services.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static final List<Customer> customerList = new LinkedList<>();
    private static final Scanner scanner = new Scanner(System.in);

    static {
        customerList.add(new Customer(11231256, "Hao", 20, "Ben xe Da Nang", 1, "Male", 123123123, "hao@gmail.com", "Diamond"));
        customerList.add(new Customer(21232133, "Hoang", 24, "Son Tra", 2, "Male", 297496635, "hoang@gmail.com", "Platinum"));
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
        System.out.println("Enter the age: ");
        int age = Integer.parseInt(scanner.nextLine());
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
        boolean check = true;
        StringBuilder customerType = new StringBuilder();
        while (check) {
            System.out.println("Choose the customer type: ");
            System.out.println("1. Diamond");
            System.out.println("2. Platinium");
            System.out.println("3. Gold");
            System.out.println("4. Silver");
            System.out.println("5. Member");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    customerType.append("Diamond");
                    check = false;
                    break;
                case 2:
                    customerType.append("Platinium");
                    check = false;
                    break;
                case 3:
                    customerType.append("Gold");
                    check = false;
                    break;
                case 4:
                    customerType.append("Silver");
                    check = false;
                    break;
                case 5:
                    customerType.append("Member");
                    check = false;
                    break;
                default:
                    check = true;
                    break;
            }
        }
        Customer customer = new Customer(id, name, age, address, customerId, gender, phoneNumber, email, customerType.toString());
        customerList.add(customer);
        System.out.println("Add complete");
    }

    @Override
    public void edit() {
        System.out.println("Enter the id of employee your want to edit: ");
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomerId() == input) {
                System.out.println("Enter the id: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter the name: ");
                String name = scanner.nextLine();
                System.out.println("Enter the age: ");
                int age = Integer.parseInt(scanner.nextLine());
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
                boolean check = true;
                StringBuilder customerType = new StringBuilder();
                while (check) {
                    System.out.println("Choose the customer type: ");
                    System.out.println("1. Diamond");
                    System.out.println("2. Platinum");
                    System.out.println("3. Gold");
                    System.out.println("4. Silver");
                    System.out.println("5. Member");
                    int choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            customerType.append("Diamond");
                            check = false;
                            break;
                        case 2:
                            customerType.append("Platinium");
                            check = false;
                            break;
                        case 3:
                            customerType.append("Gold");
                            check = false;
                            break;
                        case 4:
                            customerType.append("Silver");
                            check = false;
                            break;
                        case 5:
                            customerType.append("Member");
                            check = false;
                            break;
                        default:
                            check = true;
                            break;
                    }
                }

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
