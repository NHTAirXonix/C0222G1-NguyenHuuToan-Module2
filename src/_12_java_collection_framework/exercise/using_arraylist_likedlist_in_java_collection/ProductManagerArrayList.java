package _12_java_collection_framework.exercise.using_arraylist_likedlist_in_java_collection;

import java.util.*;

public class ProductManagerArrayList {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Product> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        arrayList.add(new Product("Product1", 5, 12000));
        arrayList.add(new Product("Product2", 4, 13000));
        arrayList.add(new Product("Product3", 3, 14000));
        arrayList.add(new Product("Product4", 2, 15000));
        arrayList.add(new Product("Product5", 1, 16000));
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
                    showList(arrayList);
                    break;
                case 2:
                    addProduct(arrayList);
                    break;
                case 3:
                    editProduct(arrayList);
                    break;
                case 4:
                    removeProduct(arrayList);
                    break;
                case 5:
                    searchProduct(arrayList);
                    break;
                case 6:
                    sortProductList(arrayList);
                    break;
                case 7:
                    check = false;
                    break;
            }
        }


    }

    public static void showList(ArrayList<Product> arrayList ) {
        for (Product elements : arrayList) {
            System.out.println(elements.toString());
        }
    }

    public static void addProduct(ArrayList<Product> arrayList ) {
        System.out.println("Enter the name of product");
        String name = scanner.nextLine();
        System.out.println("Enter the id of product");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the price of product");
        double price = Double.parseDouble(scanner.nextLine());
        arrayList.add(new Product(name, id, price));
        System.out.println("Add complete");
    }

    public static void editProduct(ArrayList<Product> arrayList ) {
        System.out.println("Enter the id of product you want to edit");
        int id = Integer.parseInt(scanner.nextLine());
        boolean checka = false;
        for (Product elements : arrayList) {
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

    public static void removeProduct(ArrayList<Product> arrayList ) {
        System.out.println("Enter the id of product you want to remove");
        int id = Integer.parseInt(scanner.nextLine());
        boolean checka = false;
        int hold =0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == id) {
                hold = i;
                checka = true;
            }
        }
        arrayList.remove(hold);
        if (checka) {
            System.out.println("Remove complete");
        } else {
            System.out.println("Wrong id");
        }
    }

    public static void searchProduct(ArrayList<Product> arrayList ){
        System.out.println("Enter the name of product");
        String name = scanner.nextLine();
        for (int i = 0; i <arrayList.size() ; i++) {
            if (arrayList.get(i).getName().equals(name)){
                System.out.println("This list have product name:" + name);
                break;
            }
            if (i == arrayList.size()-1){
                System.out.println("This list don't have product name: " + name);
            }
        }
    }

    public static void sortProductList(ArrayList<Product> arrayList){

            Collections.sort(arrayList);

    }
}
