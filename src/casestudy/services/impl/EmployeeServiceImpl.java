package casestudy.services.impl;

import casestudy.models.person.Employee;
import casestudy.regex_class.EmployeeRegex;
import casestudy.services.EmployeeService;
import casestudy.utils.ReadAndWrite;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList;
    private static final Scanner scanner = new Scanner(System.in);


    @Override
    public void display() throws IOException {
        employeeList = ReadAndWrite.readFileEmployee();
        for (Employee elements : employeeList) {
            System.out.println(elements.toString());
        }
    }

    @Override
    public void addNew() throws IOException {
        System.out.println("Enter the id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        String age = EmployeeRegex.regexAge();
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
        String level = EmployeeRegex.getLevel();
        String position = EmployeeRegex.getPosition();
        System.out.println("Enter the  salary: ");
        long salary = Integer.parseInt(scanner.nextLine());
        String line = id + "," + name + "," + age + "," + address + "," + employeeId + "," + gender + "," + phoneNumber + "," + email + "," + level + "," + position + "," + salary;
        ReadAndWrite.writeFileEmployee(line);
        System.out.println("Add complete");
    }

    @Override
    public void edit() throws IOException {
        employeeList = ReadAndWrite.readFileEmployee();
        System.out.println("Enter the id of employee your want to edit: ");
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeId() == input) {
                System.out.println("Enter the id: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter the name: ");
                String name = scanner.nextLine();
                String age = EmployeeRegex.regexAge();
                System.out.println("Enter the address");
                String address = scanner.nextLine();
                System.out.println("Enter the gender: ");
                String gender = scanner.nextLine();
                System.out.println("Enter the phone number: ");
                long phoneNumber = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter the email: ");
                String email = scanner.nextLine();
                String level = EmployeeRegex.getLevel();
                String position = EmployeeRegex.getPosition();
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

                File file = new File("D:\\CODEGYM\\C0222G1_Nguyen_Huu_Toan_Module2\\src\\casestudy\\data\\employee.csv");
                file.delete();
                for (Employee elements : employeeList) {
                    String line = elements.getId() + "," +
                            elements.getName() + "," +
                            elements.getAge() + "," +
                            elements.getAddress() + "," +
                            elements.getEmployeeId() + "," +
                            elements.isGender() + "," +
                            elements.getPhoneNumber() + "," +
                            elements.getEmail() + "," +
                            elements.getLevel() + "," +
                            elements.getPosition() + "," +
                            elements.getSalary();
                    ReadAndWrite.writeFileEmployee(line);
                }
                System.out.println("Edit complete");
            } else if (i == employeeList.size() - 1) {
                System.out.println("Wrong id");
            }
        }
    }

    @Override
    public void delete() throws IOException {
        employeeList = ReadAndWrite.readFileEmployee();
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
        File file = new File("D:\\CODEGYM\\C0222G1_Nguyen_Huu_Toan_Module2\\src\\casestudy\\data\\employee.csv");
        file.delete();
        for (Employee elements : employeeList) {
            String line = elements.getId() + "," +
                    elements.getName() + "," +
                    elements.getAge() + "," +
                    elements.getAddress() + "," +
                    elements.getEmployeeId() + "," +
                    elements.isGender() + "," +
                    elements.getPhoneNumber() + "," +
                    elements.getEmail() + "," +
                    elements.getLevel() + "," +
                    elements.getPosition() + "," +
                    elements.getSalary();
            ReadAndWrite.writeFileEmployee(line);
        }
    }
}
