package casestudy.regex_class;

import casestudy.utils.RegexData;

import java.util.Scanner;

public class FacilityRegex {
    public static Scanner scanner = new Scanner(System.in);
    private static final String VILLA_CODE = "^(SVVL)[-][\\d]{4}$";
    private static final String HOUSE_CODE = "^(SVHO)[-][\\d]{4}$";
    private static final String ROOM_CODE = "^(SVRO)[-][\\d]{4}$";
    private static final String REGEX_STRING = "^[A-Z]+[\\w]{1,}+$";

    public static String inputFacilityIdVilla() {
        System.out.println("Enter the id of Facility (SVVL-XXXX):");

        return RegexData.regexStr(scanner.nextLine(), VILLA_CODE, "Wrong format, please re-enter the id of Facility (SVVL-XXXX):");
    }

    public static String inputFacilityIdHouse() {
        System.out.println("Enter the id of Facility (SVHO-XXXX):");
        return RegexData.regexStr(scanner.nextLine(), HOUSE_CODE, "Wrong format, please re-enter the id of Facility (SVHO-XXXX):");
    }

    public static String inputFacilityIdRoom() {
        System.out.println("Enter the id of Facility (SVRO-XXXX):");
        return RegexData.regexStr(scanner.nextLine(), ROOM_CODE, "Wrong format, please re-enter the id of Facility (SVRO-XXXX):");
    }

    public static String inputFacilityName() {
        System.out.println("Enter the name of Facility (uppercase first character):");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STRING, "Wrong format, please re-enter the name of Facility (uppercase first character):");
    }

    public static Double inputUseArea() {
        double useArea;
        while (true) {
            try {
                System.out.println("Enter the use area (bigger than 30m2):");
                useArea = Double.parseDouble(scanner.nextLine());
                if (useArea > 30) {
                    break;
                } else {
                    System.err.println("Use area must bigger than 30m2");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong input format");
            }

        }
        return useArea;
    }

    public static Double inputRentPrice() {
        double inputRentPrice;
        while (true) {
            try {
                System.out.println("Enter the rent price (bigger than 0):");
                inputRentPrice = Double.parseDouble(scanner.nextLine());
                if (inputRentPrice > 0) {
                    break;
                } else {
                    System.err.println("Rent price must bigger than 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong input format");
            }

        }
        return inputRentPrice;
    }

    public static int inputAmountPeople() {
        int amountPeople;
        while (true) {
            try {
                System.out.println("Enter the Amount of people (bigger than 0 and smaller than 21):");
                amountPeople = Integer.parseInt(scanner.nextLine());
                if (amountPeople >= 0 && amountPeople <= 20) {
                    break;
                } else {
                    System.err.println("Amount of people must bigger than 0 and smaller than 21");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong input format");
            }
        }
        return amountPeople;
    }

    public static String inputRentType() {
        String rentType;
        while (true){
            System.out.println("Enter the rent type (Day / Month / Year):");
            rentType = scanner.nextLine();
            if (rentType.equals("Day") || rentType.equals("Month") || rentType.equals("Year")){
                break;
            }
            System.err.println("Wrong input!");
        }
        return rentType;
    }

    public static int inputFloor() {
        int floor;
        while (true) {
            try {
                System.out.println("Enter the Floor price (bigger than 0):");
                floor = Integer.parseInt(scanner.nextLine());
                if (floor > 0) {
                    break;
                } else {
                    System.err.println("Enter the Floor must bigger than 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong input format");
            }
        }
        return floor;
    }

    public static String inputRoomStandard() {
        String roomStandard;
        while (true) {
            System.out.println("---------Room-Standard---------");
            System.out.println("1. Vip");
            System.out.println("2. Luxury");
            System.out.println("3. Normal");
            System.out.println("4. Affordable");
            System.out.println("Enter your choose):");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    roomStandard = "Vip";
                    return roomStandard;
                case "2":
                    roomStandard = "Luxury";
                    return roomStandard;
                case "3":
                    roomStandard = "Normal";
                    return roomStandard;
                case "4":
                    roomStandard = "Affordable";
                    return roomStandard;
                default:
                    System.err.println("Wrong in put");
                    break;
            }
        }
    }

    public static double inputPoolArea() {
        double poolArea;
        while (true) {
            try {
                System.out.println("Enter the pool area (bigger than 30m2):");
                poolArea = Double.parseDouble(scanner.nextLine());
                if (poolArea > 30) {
                    break;
                } else {
                    System.err.println("Pool area must bigger than 30m2");
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong input format");
            }
        }
        return poolArea;
    }
}
