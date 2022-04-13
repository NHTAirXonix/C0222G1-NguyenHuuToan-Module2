package _10_dsa_list.exercise.use_arraylist_with_library;

import java.util.List;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> array = new MyList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        System.out.println(array.toString());
        array.add(2, 10);
        System.out.println(array.toString());
        array.remove(2);
        System.out.println(array.toString());
        array.clear();
        System.out.println(array.toString());
    }
}