package free.practice;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Person[] array = new Person[100];
        int count = 0;
        Scanner input = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("------------------------------\n1. Add\n2. Show list\n3. Delete\n4. Exit");
            int push = input.nextInt();
            switch (push) {
                case 1:
                    add(count, array);
                    count++;
                    break;
                case 2:
                    showList(array);
                    break;
                case 3:
                    delete(array);
                    break;
                case 4:
                    check = false;
                    break;
            }
        }
    }

    public static void add(int count, Person[] array) {

        Scanner input = new Scanner(System.in);
        String choice = "student";
        System.out.println("1. Add new teacher\n2. Add new student");
        int getIn = Integer.parseInt(input.nextLine());
        if (getIn == 1) {
            choice = "teacher";
        }
        System.out.println("Enter " + choice + " name: ");
        String name = input.nextLine();
        System.out.println("Enter " + choice + " age: ");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("Enter " + choice + " gender (1 male 2 female): ");
        boolean gender = false;
        int genders = Integer.parseInt(input.nextLine());
        if (genders == 1) {
            gender = true;
        }
        if (choice.equals("teacher")) {
            System.out.println("Enter " + choice + " salary: ");
            int salary = Integer.parseInt(input.nextLine());
            Person newteacher = new Teacher(name, age, gender, salary);
            array[count] = newteacher;
        } else {
            System.out.println("Enter " + choice + " point: ");
            int point = Integer.parseInt(input.nextLine());
            Person newstudent = new Student(name, age, gender, point);
            array[count] = newstudent;
        }
    }

    public static void showList(Person[] array) {
        System.out.println("------------------------------\nThe list is: ");
        for (int i = 0; i < 100; i++) {
            if (array[i] == null) {
                break;
            }
            System.out.println(array[i].toString());
        }
    }

    public static void delete(Person[] array) {
        Scanner input = new Scanner(System.in);
        String nameInput = "student";
        boolean check = false;
        showList(array);
        System.out.println("1. Delete student\n2. Delete teacher");
        int choice = Integer.parseInt(input.nextLine());
        if (choice == 2) {
            nameInput = "teacher";
        }
        System.out.println("Enter the name of " + nameInput + " you want to delete: ");
        String name = input.nextLine();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                if (check == false) {
                    System.out.println("That name doesn't appear in list of " + nameInput);
                }
                break;
            } else if (choice==1 && name.equals(array[i].getName()) && array[i] instanceof Student ||
                       choice==2 && name.equals(array[i].getName()) && array[i] instanceof Teacher) {
                check = true;
                for (int j = i; j < array.length; j++, i++) {
                    if (j == array.length - 1) {
                        array[i] = null;
                        continue;
                    }
                    array[i] = array[i + 1];
                }
                showList(array);
                break;
            }
        }
    }
}
