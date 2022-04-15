package _12_java_collection_framework.exercise.using_arraylist_likedlist_in_java_collection;

import java.util.Comparator;

public class Comparetor implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getName().compareTo(o2.getName()) > 0) {
            return 1;
        } else if (o1.getName().compareTo(o2.getName()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
