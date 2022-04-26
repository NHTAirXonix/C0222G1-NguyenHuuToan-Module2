package casestudy.regex_class;

import casestudy.utils.AgeException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomerRegex {
    static Scanner scanner = new Scanner(System.in);
    public static final String REGEX_BIRTHDAY = "((0[13578]|1[02])[\\/.]31[\\/.](18|19|20)[0-9]{2})|((01|0[3-9]|1[1-2])[\\/.](29|30)[\\/.](18|19|20)[0-9]{2})|((0[1-9]|1[0-2])[\\/.](0[1-9]|1[0-9]|2[0-8])[\\/.](18|19|20)[0-9]{2})|((02)[\\/.]29[\\/.](((18|19|20)(04|08|[2468][048]|[13579][26]))|2000))";

    public static String regexAge() {
        String temp = scanner.nextLine();
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(REGEX_BIRTHDAY, temp)) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age = LocalDate.parse(temp, formatter);
                    LocalDate now = LocalDate.now();
                    int current = Period.between(age, now).getYears();
                    if (current < 100 && current > 18) {
                        check = false;
                    } else {
                        throw new AgeException("Age bigger than 18 and smaller than 100, please re-enter");
                    }
                } else {
                    throw new AgeException("Wrong input format, please re-enter");
                }
            } catch (AgeException e) {
                System.err.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }

    public static StringBuilder customerType(){
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
