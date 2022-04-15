package _12_java_collection_framework.exercise.using_arraylist_likedlist_in_java_collection;

import _11_dsa_stack_queue.exercise.demerging_use_queue.Personnel;

public class Product implements Comparable<Product> {
    private String name;
    private int id;
    private double price;

    public Product(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setNamePro(String namePro) {
        this.name = namePro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name product = '" + name + '\'' +
                ", id = " + id +
                ", price = " + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(o.getPrice(), this.price);
    }
}
