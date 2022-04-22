package _17_io_binary_file_serialization.excercise.program_control_product_to_binaryfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "BMW i8", "BMW", 90000000));
        productList.add(new Product(2, "MAZDA 3", "MAZDA", 10000000));
        productList.add(new Product(3, "HONDA CRV", "HONDA", 13000000));
        System.out.println("Enter the url of file: ");
        String path = scanner.nextLine();
        writeToFile(path, productList);

        boolean check = true;
        while (check) {
            System.out.println("----------MENU----------");
            System.out.println("1. Show product list");
            System.out.println("2. Add new product");
            System.out.println("3. Find product by name");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    displayProductList(readDataFromFile(path));
                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":
                    check = false;
                    break;
                default:
                    System.out.println("Wrong input");
                    break;


            }
        }
    }

    public static void writeToFile(String path, List<Product> productList) {
        try {
            FileOutputStream flowIn = new FileOutputStream(path);
            ObjectOutputStream flowOut = new ObjectOutputStream(flowIn);
            flowOut.writeObject(productList);
            flowOut.close();
            flowIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Product> readDataFromFile(String path) {
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            productList = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }

    public static void displayProductList(List<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }


}
