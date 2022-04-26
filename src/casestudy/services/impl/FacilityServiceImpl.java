package casestudy.services.impl;

import casestudy.models.facility.Facility;
import casestudy.models.facility.House;
import casestudy.models.facility.Room;
import casestudy.models.facility.Villa;
import casestudy.models.person.Customer;
import casestudy.regex_class.FacilityRegex;
import casestudy.services.FacilityService;
import casestudy.utils.RegexData;

import java.util.regex.Pattern;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static final Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    static {
        facilityIntegerMap.put(new Villa("1", "Villa 1", 200, 2000000, 10, "week", "VIP", 25, 2), 0);
        facilityIntegerMap.put(new Villa("2", "Villa 2", 100, 1000000, 50, "day", "NORMAL", 25, 2), 0);
    }

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service " + element.getKey() + " number of rent " + element.getValue());
        }

    }

    public static Map<Facility, Integer> getFacilityIntegerMap() {
        return facilityIntegerMap;
    }

    @Override
    public void displayMaintain() {
        boolean check = true;
        while (check) {
            System.out.println("----------Maintenance-Facility----------");
            for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
                if (element.getValue() >= 5) {
                    System.out.println("Service " + element.getKey() + " number of rent " + element.getValue());
                }
            }
            System.out.println("1. Repair all facility");
            System.out.println("2. Exit");
            System.out.println("Enter your choice");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
                        if (element.getValue() >= 5) {
                            element.setValue(0);
                        }
                    }
                    break;
                case "2":
                    check = false;
                    break;
                default:
                    System.out.println("Wrong input");
            }
        }
    }

    @Override
    public void addNewVilla() {
        String facilityId = FacilityRegex.inputFacilityIdVilla();
        String serviceName = FacilityRegex.inputFacilityName();
        double useArea = FacilityRegex.inputUseArea();
        double rentPrice = FacilityRegex.inputRentPrice();
        int maximumPeople = FacilityRegex.inputAmountPeople();
        String rentType = FacilityRegex.inputRentType();
        String roomStandard = FacilityRegex.inputRoomStandard();
        double poolArea = FacilityRegex.inputPoolArea();
        int floor = FacilityRegex.inputFloor();
        Villa villa = new Villa(facilityId, serviceName, useArea, rentPrice, maximumPeople, rentType, roomStandard, poolArea, floor);
        facilityIntegerMap.put(villa, 0);
    }

    @Override
    public void addNewHouse() {
        String facilityId = FacilityRegex.inputFacilityIdHouse();
        String serviceName = FacilityRegex.inputFacilityName();
        double useArea = FacilityRegex.inputUseArea();
        double rentPrice = FacilityRegex.inputRentPrice();
        int maximumPeople = FacilityRegex.inputAmountPeople();
        String rentType = FacilityRegex.inputRentType();
        String roomStandard = FacilityRegex.inputRoomStandard();
        int floor = FacilityRegex.inputFloor();
        House house = new House(facilityId, serviceName, useArea, rentPrice, maximumPeople, rentType, roomStandard, floor);
        facilityIntegerMap.put(house, 0);
    }

    @Override
    public void addNewRoom() {
        String facilityId = FacilityRegex.inputFacilityIdRoom();
        String serviceName = FacilityRegex.inputFacilityName();
        double useArea = FacilityRegex.inputUseArea();
        double rentPrice = FacilityRegex.inputRentPrice();
        int maximumPeople = FacilityRegex.inputAmountPeople();
        String rentType = FacilityRegex.inputRentType();
        Room room = new Room(facilityId, serviceName, useArea, rentPrice, maximumPeople, rentType);
        facilityIntegerMap.put(room, 0);
    }

    @Override
    public void addNew() {
    }

    @Override
    public void edit() {
    }

    @Override
    public void delete() {
    }
}
