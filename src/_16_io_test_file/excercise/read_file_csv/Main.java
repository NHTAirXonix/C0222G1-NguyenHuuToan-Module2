package _16_io_test_file.excercise.read_file_csv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Contry> contriesList = new ArrayList<>();

        List<String[]> listStr = ReadAndWriter.readFile("D:\\CODEGYM\\C0222G1_Nguyen_Huu_Toan_Module2\\src\\_16_io_test_file\\excercise\\read_file_csv\\world.csv");
        for (String[] item :
                listStr) {
            Contry contry = new Contry(Integer.parseInt(item[0]), item[1], item[2]);
            contriesList.add(contry);
        }
        for (Contry contry :
                contriesList) {
            System.out.println(contry.toString());
        }
    }
}
