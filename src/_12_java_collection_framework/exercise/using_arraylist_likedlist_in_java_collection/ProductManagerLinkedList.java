package _12_java_collection_framework.exercise.using_arraylist_likedlist_in_java_collection;

import java.util.*;

public class ProductManagerLinkedList {

    public static void main(String[] args) {
        LinkedList<Product> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        linkedList.add(new Product("Product1", 5, 12000));
        linkedList.add(new Product("Product5", 4, 13000));
        linkedList.add(new Product("Product3", 3, 14000));
        linkedList.add(new Product("Product4", 2, 15000));
        linkedList.add(new Product("Product2", 1, 16000));
        boolean check = true;
        while (check) {
            System.out.println("--------------Enter your choice--------------");
            System.out.println("1. Show list products");
            System.out.println("2. Add product");
            System.out.println("3. Edit product");
            System.out.println("4. Remove product");
            System.out.println("5. Search product");
            System.out.println("6. Sort the list of products");
            System.out.println("7. Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    showList(linkedList);
                    break;
                case 2:
                    addProduct(linkedList);
                    break;
                case 3:
                    editProduct(linkedList);
                    break;
                case 4:
                    removeProduct(linkedList);
                    break;
                case 5:
                    searchProduct(linkedList);
                    break;
                case 6:
                    sortProductList(linkedList);
                    break;
                case 7:
                    check = false;
                    break;
            }
        }


    }

    public static void showList(LinkedList<Product> linkedList) {
        for (Product elements : linkedList) {
            System.out.println(elements.toString());
        }
    }

    public static void addProduct(LinkedList<Product> linkedList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of product");
        String name = scanner.nextLine();
        System.out.println("Enter the id of product");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the price of product");
        double price = Double.parseDouble(scanner.nextLine());
        linkedList.add(new Product(name, id, price));
        System.out.println("Add complete");
    }

    public static void editProduct(LinkedList<Product> linkedList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id of product you want to edit");
        int id = Integer.parseInt(scanner.nextLine());
        boolean checka = false;
        for (Product elements : linkedList) {
            if (elements.getId() == id) {
                System.out.println("Enter the name of product");
                String name = scanner.nextLine();
                System.out.println("Enter the price of product");
                double price = Double.parseDouble(scanner.nextLine());
                elements.setNamePro(name);
                elements.setPrice(price);
                checka = true;
            }
        }
        if (checka) {
            System.out.println("Edit complete");
        } else {
            System.out.println("Wrong id");
        }
    }

    public static void removeProduct(LinkedList<Product> linkedList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id of product you want to remove");
        int id = Integer.parseInt(scanner.nextLine());
        boolean checka = false;
        int hold = 0;
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).getId() == id) {
                hold = i;
                checka = true;
            }
        }
        linkedList.remove(hold);
        if (checka) {
            System.out.println("Remove complete");
        } else {
            System.out.println("Wrong id");
        }
    }

    public static void searchProduct(LinkedList<Product> linkedList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of product");
        String name = scanner.nextLine();
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).getName().equals(name)) {
                System.out.println("This list have product name:" + name);
                break;
            }
            if (i == linkedList.size() - 1) {
                System.out.println("This list don't have product name: " + name);
            }
        }
    }

    public static void sortProductList(LinkedList<Product> linkedList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1. Price from Lowest to Biggest");
        System.out.println("2. Price from Biggest to Lowest");
        System.out.println("3. Name from Biggest to Lowest");
        int input = scanner.nextInt();
        Comparator obj = new Comparetor();
        if (input == 1) {

            Collections.sort(linkedList);
            Collections.reverse(linkedList);
        } else if (input == 2) {
            Collections.sort(linkedList);
        } else {
            Collections.sort(linkedList, obj);
        }

    }
}
