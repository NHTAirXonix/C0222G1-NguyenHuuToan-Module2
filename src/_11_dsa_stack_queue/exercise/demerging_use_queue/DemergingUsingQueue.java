package _11_dsa_stack_queue.exercise.demerging_use_queue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DemergingUsingQueue {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Queue<Personnel> NAM = new LinkedList<>();
        Queue<Personnel> NU = new LinkedList<>();
        Date date1 = sdf.parse("1995-02-23");
        Date date2 = sdf.parse("2001-10-31");
        Date date3 = sdf.parse("1999-02-23");
        Date date4 = sdf.parse("2002-10-31");
        Date date5 = sdf.parse("1998-02-30");
        Personnel [] arrayPer = new Personnel[5];
        arrayPer[0] = new Personnel("Chien", true, date1);
        arrayPer[1] = new Personnel("Ha", false, date2);
        arrayPer[2] = new Personnel("Toan", true,date3);
        arrayPer[3] = new Personnel("Thuy", false,date4);
        arrayPer[4] = new Personnel("Ngoc", false,date5);


        System.out.println("\n---------------------------LIST BEFORE SORT----------------------------");
        for (Personnel item: arrayPer) {
            System.out.println(item.toString());
        }
        Arrays.sort(arrayPer);

        for (Personnel item : arrayPer) {
            if (item.isGender()){
                NAM.add(item);
            } else {
                NU.add(item);
            }
        }

        List<Personnel> orderedList = new ArrayList<>();
        while (NU.size() > 0){
            orderedList.add(NU.remove());
        }
        while (NAM.size() > 0){
            orderedList.add(NAM.remove());
        }
        System.out.println("\n----------------------------LIST AFTER SORT----------------------------");

        for (Personnel item: orderedList) {
            System.out.println(item.toString());
        }
    }
}
