package _16_io_test_file.excercise.copy_file_text;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteFile2 readAndWriteFile = new ReadAndWriteFile2();
        List<String> array = ReadAndWriteFile2.readFile("D:\\CODEGYM\\C0222G1_Nguyen_Huu_Toan_Module2\\src\\_16_io_test_file\\excercise\\copy_file_text\\origin.txt");
        readAndWriteFile.copyFile("D:\\CODEGYM\\C0222G1_Nguyen_Huu_Toan_Module2\\src\\_16_io_test_file\\excercise\\copy_file_text\\copy.txt", array);
    }
}
