package casestudy.services.impl;

import casestudy.models.Employee;
import casestudy.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


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
        System.out.println("Enter the day of birth: ");
        String dayOfBirth = scanner.nextLine();
        System.out.println("Enter the gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter the  id number: ");
        int idNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the phone number: ");
        long phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the employee id: ");
        int employeeId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the email: ");
        String email = scanner.nextLine();
        System.out.println("Enter the level: ");
        String level = scanner.nextLine();
        System.out.println("Enter the position: ");
        String position = scanner.nextLine();
        System.out.println("Enter the  salary: ");
        int salary = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(id, name, age, address, employeeId,
                dayOfBirth, gender, idNumber, phoneNumber,
                email, level, position, salary);
        employeeList.add(employee);
    }

    @Override
    public void edit() {
        
    }

    @Override
    public void delete() {

    }
}