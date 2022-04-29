package casestudy.regex_class;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class CustomerRegex {
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

    public static StringBuilder customerType() {
        boolean check = true;
        StringBuilder customerType = new StringBuilder();
        while (check) {
            System.out.println("Choose the customer type: ");
            System.out.println("1. Diamond");
            System.out.println("2. Platinium");
            System.out.println("3. Gold");
            System.out.println("4. Silver");
            System.out.println("5. Member");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    customerType.append("Diamond");
                    check = false;
                    break;
                case 2:
                    customerType.append("Platinium");
                    check = false;
                    break;
                case 3:
                    customerType.append("Gold");
                    check = false;
                    break;
                case 4:
                    customerType.append("Silver");
                    check = false;
                    break;
                case 5:
                    customerType.append("Member");
                    check = false;
                    break;
                default:
                    check = true;
                    break;
            }
        }
        return customerType;
    }
}
