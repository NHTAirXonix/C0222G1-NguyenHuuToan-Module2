package _19_string_regex.excercise.validate_phone_number;

import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final String[] phoneNumber = new String[]{"(84)-(0978489648)", "(a8)-(22222222)", "(78)-(22222222)", "(42)-(0978232348)"};
    private static final String PHONENUMBER_REGEX = "^[(][0-9]{2}[)][-][(][0]{1}[0-9]{9}[)]$";

    public static void main(String[] args) {

        for (int i = 0; i < phoneNumber.length; i++) {
            if (Pattern.matches(PHONENUMBER_REGEX, phoneNumber[i])) {
                System.out.println(phoneNumber[i] + " is a phone number");
            } else {
                System.out.println(phoneNumber[i] + " is not a phone number");
            }
        }
    }
}