package ss1_Introduction_to_java.bai_tap;
import java.util.Scanner;
public class ung_dung_doc_so_thanh_chu {
    public static class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your number: ");
            int input;
            input = scanner.nextInt();

            int one = input % 10;
            int tens = (input / 10) % 10;
            int hundred = (input / 100) % 10;

            String output1 = "";
            String output2 = "";
            String output3 = "";

            if (one > 0) {
                switch (one) {
                    case 1:
                        output1 = "one";
                        break;
                    case 2:
                        output1 = "two";
                        break;
                    case 3:
                        output1 = "three";
                        break;
                    case 4:
                        output1 = "four";
                        break;
                    case 5:
                        output1 = "five";
                        break;
                    case 6:
                        output1 = "six";
                        break;
                    case 7:
                        output1 = "seven";
                        break;
                    case 8:
                        output1 = "eight";
                        break;
                    case 9:
                        output1 = "nine";
                        break;
                    default:
                        output1 = "wrong input";
                }
            }
            if (tens == 1) {
                switch (one) {
                    case 1:
                        output2 = "eleven";
                        break;
                    case 2:
                        output2 = "trelews";
                        break;
                    case 3:
                        output2 = "thirteen";
                        break;
                    case 4:
                        output2 = "fourteen";
                        break;
                    case 5:
                        output2 = "fifteen";
                        break;
                    case 6:
                        output2 = "sixteen";
                        break;
                    case 7:
                        output2 = "seventeen";
                        break;
                    case 8:
                        output2 = "eighteen";
                        break;
                    case 9:
                        output2 = "nineteen";
                        break;
                    default:
                        output2 = "wrong input";
                }
            } else {
                switch (tens) {
                    case 2:
                        output2 = "twenty";
                        break;
                    case 3:
                        output2 = "thirty";
                        break;
                    case 4:
                        output2 = "forty";
                        break;
                    case 5:
                        output2 = "fifty";
                        break;
                    case 6:
                        output2 = "sixty";
                        break;
                    case 7:
                        output2 = "seventy";
                        break;
                    case 8:
                        output2 = "eighty";
                        break;
                    case 9:
                        output2 = "ninety";
                        break;
                }
            }
            if (hundred > 0) {
                switch (hundred) {
                    case 1:
                        output3 = "one hundred";
                        break;
                    case 2:
                        output3 = "two hundred";
                        break;
                    case 3:
                        output3 = "three hundred";
                        break;
                    case 4:
                        output3 = "four hundred";
                        break;
                    case 5:
                        output3 = "five hundred";
                        break;
                    case 6:
                        output3 = "six hundred";
                        break;
                    case 7:
                        output3 = "seven hundred";
                        break;
                    case 8:
                        output3 = "eight hundred";
                        break;
                    case 9:
                        output3 = "nine hundred";
                        break;
                }
            }

            if (tens == 1) {
                System.out.print("Your number is: " + input + " = " + output3 + " " + output2);
            } else if (tens != 1 && one == 0) {
                System.out.print("Your number is: " + input + " = " + output3 + " " + output2);
            } else if (tens != 1 && one != 0) {
                System.out.print("Your number is: " + input + " = " + output3 + " " + output2 +" "+output1);
            }

        }
    }
}
