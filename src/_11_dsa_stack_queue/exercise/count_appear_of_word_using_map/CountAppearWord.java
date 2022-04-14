package _11_dsa_stack_queue.exercise.count_appear_of_word_using_map;

import java.util.Map;
import java.util.TreeMap;

public class CountAppearWord {
    public static void main(String[] args) {
        String strings = "The best in the Best Is the beSt Day EVER";
        strings = strings.toLowerCase();
        String[] newarray = strings.split(" ");
        TreeMap<String, Integer> maps = new TreeMap<>();

        for (int i = 0; i < newarray.length; i++) {
            if (!maps.containsKey(newarray[i])) {
                maps.put(newarray[i], 1);
            } else {
                maps.put(newarray[i], maps.get(newarray[i])+1);
            }
        }
        for (Map.Entry m: maps.entrySet() ){
            System.out.println(m.getKey() +" "+m.getValue());
        }
        // System.out.println(maps); cách 2 để in ra
    }
}
