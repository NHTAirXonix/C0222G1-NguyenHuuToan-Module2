package casestudy.regex_class;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Scanner;


public class EmployeeRegex {
    static Scanner scanner = new Scanner(System.in);

    public static void dateTimeCheck(String dateOfBirth) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
        LocalDate localDate1 = LocalDate.parse(dateOfBirth, formatter);
        LocalDate localDate2 = LocalDate.now();
        localDate2.format(formatter);

        int year = Period.between(localDate1, localDate2).getYears();
        if (year < 18 || year > 100) {
            throw new Exception();
        }
    }

    public static String regexAge() {
        String dateOfBirth;
        while (true) {
            try {
                System.out.println("Enter your birth day (dd/MM/yyyy): ");
                dateOfBirth = scanner.nextLine();
                dateTimeCheck(dateOfBirth);
                break;
            } catch (Exception e) {
                System.err.println("Age bigger than 18 and smaller than 100 and format is (dd/MM/yyyy), please re-enter");
                ;
            }
        }
        return dateOfBirth;
    }

    public static String getLevel() {
        boolean check = true;
        String level = "";
        while (check) {
            System.out.println("Choose the level: ");
            System.out.println("1. Intermediate");
            System.out.println("2. Colleges");
            System.out.println("3. University");
            System.out.println("4. Postgraduate");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    level = "Intermediate";
                    check = false;
                    break;
                case "2":
                    level = "Colleges";
                    check = false;
                    break;
                case "3":
                    level = "University";
                    check = false;
                    break;
                case "4":
                    level = "Postgraduate";
                    check = false;
                    break;
                default:
                    System.err.println("Wrong input!");
                    check = true;
                    break;
            }
        }
        return level;
    }

    public static String getPosition() {
        boolean check = true;
        String position = "";
        while (check) {
            System.out.println("Choose the level: ");
            System.out.println("1. Receptionist");
            System.out.println("2. Serve");
            System.out.println("3. Expert");
            System.out.println("4. Monitoring");
            System.out.println("5. Manage");
            System.out.println("6. Director");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    position = "Receptionist";
                    check = false;
                    break;
                case "2":
                    position = "Serve";
                    check = false;
                    break;
                case "3":
                    position = "Expert";
                    check = false;
                    break;
                case "4":
                    position = "Monitoring";
                    check = false;
                    break;
                case "5":
                    position = "Manage";
                    check = false;
                    break;
                case "6":
                    position = "Director";
                    check = false;
                    break;
                default:
                    System.err.println("Wrong input!");
                    check = true;
                    break;
            }
        }
        return position;
    }
}
