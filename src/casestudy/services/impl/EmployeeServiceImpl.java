package casestudy.services.impl;

import casestudy.models.person.Employee;
import casestudy.services.EmployeeService;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static final List<Employee> employeeList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);


    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
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
        System.out.println("Enter the gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter the phone number: ");
        long phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the employee id: ");
        int employeeId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the email: ");
        String email = scanner.nextLine();
        boolean check = true;
        String level = "";
        while (check) {
            System.out.println("Choose the level: ");
            System.out.println("1. Intermediate");
            System.out.println("2. Colleges");
            System.out.println("3. University");
            System.out.println("4. Postgraduate");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    level += "Intermediate";
                    check = false;
                    break;
                case 2:
                    level += "Colleges";
                    check = false;
                    break;
                case 3:
                    level += "University";
                    check = false;
                    break;
                case 4:
                    level += "Postgraduate";
                    check = false;
                    break;
                default:
                    check = true;
                    break;
            }
        }
        System.out.println("Enter the position: ");
        String position = scanner.nextLine();
        System.out.println("Enter the  salary: ");
        long salary = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(id, name, age, address, employeeId, gender, phoneNumber, email, level, position, salary);
        employeeList.add(employee);
        System.out.println("Add complete");
    }

    @Override
    public void edit() {
        System.out.println("Enter the id of employee your want to edit: ");
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeId() == input) {
                System.out.println("Enter the id: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter the name: ");
                String name = scanner.nextLine();
                System.out.println("Enter the age: ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter the address");
                String address = scanner.nextLine();
                System.out.println("Enter the day of birth: ");
                String dayOfBirth = scanner.nextLine();
                System.out.println("Enter the gender: ");
                String gender = scanner.nextLine();
                System.out.println("Enter the  id number: ");
                int idNumber = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter the phone number: ");
                long phoneNumber = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter the email: ");
                String email = scanner.nextLine();
                boolean check = true;
                String level = "";
                while (check) {
                    System.out.println("Choose the level: ");
                    System.out.println("1. Intermediate");
                    System.out.println("2. Colleges");
                    System.out.println("3. University");
                    System.out.println("4. Postgraduate");
                    int choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            level += "Intermediate";
                            check = false;
                            break;
                        case 2:
                            level += "Colleges";
                            check = false;
                            break;
                        case 3:
                            level += "University";
                            check = false;
                            break;
                        case 4:
                            level += "Postgraduate";
                            check = false;
                            break;
                        default:
                            check = true;
                            break;
                    }
                }

                System.out.println("Enter the position: ");
                String position = scanner.nextLine();
                System.out.println("Enter the  salary: ");
                long salary = Integer.parseInt(scanner.nextLine());

                employeeList.get(i).setId(id);
                employeeList.get(i).setName(name);
                employeeList.get(i).setAge(age);
                employeeList.get(i).setAddress(address);
                employeeList.get(i).setGender(gender);
                employeeList.get(i).setPhoneNumber(phoneNumber);
                employeeList.get(i).setEmail(email);
                employeeList.get(i).setLevel(level);
                employeeList.get(i).setPosition(position);
                employeeList.get(i).setSalary(salary);

                System.out.println("Edit complete");
            } else if (i == employeeList.size() - 1) {
                System.out.println("Wrong id");
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("Enter the id of employee you want to delete: ");
        int input = scanner.nextInt();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeId() == input) {
                employeeList.remove(i);
                System.out.println("Delete complete");
                break;
            }
            if (i == employeeList.size() - 1) {
                System.out.println("Wrong id");
            }
        }
    }
}
