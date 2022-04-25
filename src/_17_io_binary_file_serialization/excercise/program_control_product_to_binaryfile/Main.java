package _17_io_binary_file_serialization.excercise.program_control_product_to_binaryfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "BMW i8", "BMW", 90000000));
        productList.add(new Product(2, "MAZDA 3", "MAZDA", 10000000));
        productList.add(new Product(3, "HONDA CRV", "HONDA", 13000000));
        System.out.println("Enter the url of file: ");
        String path = scanner.nextLine();
        System.out.println(!productList.isEmpty());
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
                    productList = readDataFromFile(path);
                    addNewProduct(productList);
                    writeToFile(path, productList);
                    break;
                case "3":
                    findProduct(path);
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
        for (Product elements : products) {
            System.out.println(elements);
        }
    }

    public static void addNewProduct(List<Product> productList) {
        int id = 0;
        boolean check = true;
        while (check) {
            System.out.println("Enter the id of product");
            id = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < productList.size(); i++) {
                if (id == productList.get(i).getProductId()) {
                    check = true;
                    System.out.println("Wrong id");
                    break;
                }
                if (i == productList.size() - 1) {
                    check = false;
                    break;
                }

            }
            if (productList.isEmpty()) {
                check = false;
            }
        }
        System.out.println("Enter the name of product");
        String name = scanner.nextLine();
        System.out.println("Enter the brand of product");
        String brand = scanner.nextLine();
        System.out.println("Enter the price of product");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, brand, price);
        productList.add(product);
        System.out.println("Add new product complete");
    }

    public static void findProduct(String path) {
        List<Product> productList = readDataFromFile(path);
        System.out.println("Enter the name of product you want to find");
        String name = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < productList.size(); i++) {
            if (name.contains(productList.get(i).getProductName())) {
                check = true;
            }
        }
        if (check) {
            System.out.println("Product " + name + " appear in product list");
        } else {
            System.out.println("Product " + name + " does't appear in product list");
        }
    }
}
