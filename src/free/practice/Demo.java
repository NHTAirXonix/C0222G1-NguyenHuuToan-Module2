package free.practice;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array = new String[100];

        int push = 0;
        int count = 0;
        while (true) {
            System.out.println("------------------------------\n1. Add new student\n2. Show list of students\n3. Delete\n4. Exit");
            push = input.nextInt();

            if (push == 1) {
                System.out.println("Enter student " + (count + 1) + " name: ");
                String name = input.next();
                System.out.println("Enter student " + (count + 1) + " age: ");
                int age = input.nextInt();
                input.nextLine();
                System.out.println("Enter student " + (count + 1) + " address: ");
                String address = input.nextLine();
                System.out.println("Enter student " + (count + 1) + " point: ");
                double point = input.nextDouble();
                Student newstudent = new Student(name, age, address, point);
                array[count] = newstudent.toString();
                count++;
            }

            if (push == 2) {
                System.out.println("------------------------------\nThe list of student is: ");
                for (int i = 0; i < 100; i++) {
                    if (array[i] == null) {
                        break;
                    }
                    System.out.println((i + 1) + ". " + array[i]);
                }
            }

            if (push == 3) {
                System.out.println("------------------------------\nEnter the number of student you want to delete");
                int delete = input.nextInt();
                for (int i = 0; i < 100; i++) {
                    if (i == delete - 1) {
                        for (int j = i; j < 100; j++, i++) {
                            if (j == 100 - 1) {
                                array[i] = "deleted";
                                continue;
                            }
                            array[i] = array[i + 1];
                        }
                        break;
                    }
                }
                System.out.println("Delete complete");
                System.out.println("------------------------------\nThe list of student is: ");
                for (int i = 0; i < 100; i++) {
                    if (array[i] == null) {
                        break;
                    }
                    System.out.println((i + 1) + ". " + array[i]);
                }
            }

            if (push ==4){
                break;
            }
        }
    }
}
