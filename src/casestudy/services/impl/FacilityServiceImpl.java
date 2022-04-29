package casestudy.services.impl;

import casestudy.models.facility.Facility;
import casestudy.models.facility.House;
import casestudy.models.facility.Room;
import casestudy.models.facility.Villa;
import casestudy.regex_class.FacilityRegex;
import casestudy.services.FacilityService;
import casestudy.utils.ReadAndWrite;

import java.io.IOException;
import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void display() throws IOException {
        facilityIntegerMap = ReadAndWrite.readFileFacility();
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
    public void addNewVilla() throws IOException {
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
        String line = facilityId + "," + serviceName + "," + useArea + "," + rentPrice + "," + maximumPeople + "," + rentType + "," + roomStandard + "," + poolArea + "," + floor;
        String line2 = facilityId + "," + serviceName + "," + useArea + "," + rentPrice + "," + maximumPeople + "," + rentType + "," + roomStandard + "," + poolArea + "," + floor + "," + 0;
        ReadAndWrite.writeFileVilla(line);
        facilityIntegerMap.put(villa, 0);
        ReadAndWrite.writeFileFacility(line2);
    }

    @Override
    public void addNewHouse() throws IOException {
        String facilityId = FacilityRegex.inputFacilityIdHouse();
        String serviceName = FacilityRegex.inputFacilityName();
        double useArea = FacilityRegex.inputUseArea();
        double rentPrice = FacilityRegex.inputRentPrice();
        int maximumPeople = FacilityRegex.inputAmountPeople();
        String rentType = FacilityRegex.inputRentType();
        String roomStandard = FacilityRegex.inputRoomStandard();
        int floor = FacilityRegex.inputFloor();
        House house = new House(facilityId, serviceName, useArea, rentPrice, maximumPeople, rentType, roomStandard, floor);
        String line = facilityId + "," + serviceName + "," + useArea + "," + rentPrice + "," + maximumPeople + "," + rentType + "," + roomStandard + "," + floor;
        String line2 = facilityId + "," + serviceName + "," + useArea + "," + rentPrice + "," + maximumPeople + "," + rentType + "," + roomStandard + "," + floor + "," + 0;
        ReadAndWrite.writeFileHouse(line);
        facilityIntegerMap.put(house, 0);
        ReadAndWrite.writeFileFacility(line2);
    }

    @Override
    public void addNewRoom() throws IOException {
        String facilityId = FacilityRegex.inputFacilityIdRoom();
        String serviceName = FacilityRegex.inputFacilityName();
        double useArea = FacilityRegex.inputUseArea();
        double rentPrice = FacilityRegex.inputRentPrice();
        int maximumPeople = FacilityRegex.inputAmountPeople();
        String rentType = FacilityRegex.inputRentType();
        Room room = new Room(facilityId, serviceName, useArea, rentPrice, maximumPeople, rentType);
        String line = facilityId + "," + serviceName + "," + useArea + "," + rentPrice + "," + maximumPeople + "," + rentType;
        String line2 = facilityId + "," + serviceName + "," + useArea + "," + rentPrice + "," + maximumPeople + "," + rentType + "," + 0;
        ReadAndWrite.writeFileRoom(line);
        facilityIntegerMap.put(room, 0);
        ReadAndWrite.writeFileFacility(line2);
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
