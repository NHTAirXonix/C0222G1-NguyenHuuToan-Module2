package casestudy.services.impl;

import casestudy.models.facility.Facility;
import casestudy.models.facility.House;
import casestudy.models.facility.Room;
import casestudy.models.facility.Villa;
import casestudy.services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static final Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service " + element.getKey() + " number of rent " + element.getValue());
        }

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

    @Override
    public void displayMaintain() {


    }

    @Override
    public void addNewVilla() {
        System.out.println("Enter the facility id");
        String facilityId = scanner.nextLine();
        System.out.println("Enter the name of service");
        String serviceName = scanner.nextLine();
        System.out.println("Enter the use area");
        int useArea = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the rent price");
        double rentPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the maximum people");
        int maximumPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the rent type");
        String rentType = scanner.nextLine();
        System.out.println("Enter the room standard");
        String roomStandard = scanner.nextLine();
        System.out.println("Enter the pool area");
        double poolArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the floor");
        int floor = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(facilityId, serviceName, useArea, rentPrice, maximumPeople, rentType, roomStandard, poolArea, floor);
        facilityIntegerMap.put(villa, 0);
    }

    @Override
    public void addNewHouse() {
        System.out.println("Enter the facility id");
        String facilityId = scanner.nextLine();
        System.out.println("Enter the name of service");
        String serviceName = scanner.nextLine();
        System.out.println("Enter the use area");
        int useArea = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the rent price");
        double rentPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the maximum people");
        int maximumPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the rent type");
        String rentType = scanner.nextLine();
        System.out.println("Enter the room standard");
        String roomStandard = scanner.nextLine();
        System.out.println("Enter the floor");
        int floor = Integer.parseInt(scanner.nextLine());
        House house = new House(facilityId, serviceName, useArea, rentPrice, maximumPeople, rentType, roomStandard, floor);
        facilityIntegerMap.put(house, 0);
    }

    @Override
    public void addNewRoom() {
        System.out.println("Enter the facility id");
        String facilityId = scanner.nextLine();
        System.out.println("Enter the name of service");
        String serviceName = scanner.nextLine();
        System.out.println("Enter the use area");
        int useArea = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the rent price");
        double rentPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the maximum people");
        int maximumPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the rent type");
        String rentType = scanner.nextLine();
        Room room = new Room(facilityId, serviceName, useArea, rentPrice, maximumPeople, rentType);
        facilityIntegerMap.put(room, 0);
    }
}
