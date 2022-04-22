package casestudy.utils;

import casestudy.models.booking_contract.Booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {

    @Override
    public int compare(Booking o1, Booking o2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate starDate1 = LocalDate.parse(o1.getDayStart(), formatter);
        LocalDate starDate2 = LocalDate.parse(o2.getDayStart(), formatter);
        LocalDate endDate1 = LocalDate.parse(o1.getDayEnd(), formatter);
        LocalDate endDate2 = LocalDate.parse(o2.getDayEnd(), formatter);
        if (starDate1.compareTo(starDate2)<0){
            return -1;
        } else if (starDate1.compareTo(starDate2)>0){
            return 1;
        } else {
            if (endDate1.compareTo(endDate2) >0){
                return 1;
            } else if (endDate1.compareTo(endDate2)<0){
                return -1;
            } else{
                return 0;
            }
        }
    }
}
