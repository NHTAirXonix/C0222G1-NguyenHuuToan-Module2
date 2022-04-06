package free.practice;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length;
        System.out.println("Enter number of student you want to add");
        length = input.nextInt();
        String[] array = new String[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter student " + (i + 1) + " name: ");
            String name = input.next();
            System.out.println("Enter student " + (i + 1) + " age: ");
            int age = input.nextInt();
            input.nextLine();
            System.out.println("Enter student " + (i + 1) + " address: ");
            String address = input.nextLine();
            System.out.println("Enter student " + (i + 1) + " point: ");
            double point = input.nextDouble();
            Student newstudent = new Student(name, age, address, point);
            array[i] = newstudent.toString();
        }
        System.out.println("The list of student is: ");
        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Enter the number of student you want to delete");
        int delete = input.nextInt();
        for (int i =0; i < length; i++){
            if (i == delete-1){
                for (int j =i ; j < length; j++ , i++){
                    if (j == length-1){
                        array[i]="deleted";
                        continue;
                    }
                    array[i] =array[i+1];
                }
                break;
            }
        }
        System.out.println("The list of student is: ");
        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }
    }
}
