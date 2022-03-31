package ss1_Introduction_to_java.bai_tap;

import java.util.Scanner;

public class chuyen_doi_tien_te {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your monney ");
        usd = input.nextDouble();
        double result = usd * vnd;
        System.out.print("Your money in VND is: "+ result);

    }
}
