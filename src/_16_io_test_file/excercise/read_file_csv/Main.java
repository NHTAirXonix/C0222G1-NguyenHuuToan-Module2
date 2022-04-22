package _16_io_test_file.excercise.read_file_csv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Country> contriesList = new ArrayList<>();
        Country country;
        List<String[]> listStr = ReadAndWriter.readFile("D:\\CODEGYM\\C0222G1_Nguyen_Huu_Toan_Module2\\src\\_16_io_test_file\\excercise\\read_file_csv\\world.csv");
        for (String[] item : listStr) {
            country = new Country(Integer.parseInt(item[0]), item[1], item[2]);
            contriesList.add(country);
        }
        for (Country elements : contriesList) {
            System.out.println(elements.toString());
        }
    }
}
