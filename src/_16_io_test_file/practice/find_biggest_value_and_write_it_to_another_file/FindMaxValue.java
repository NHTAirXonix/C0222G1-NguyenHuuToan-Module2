package _16_io_test_file.practice.find_biggest_value_and_write_it_to_another_file;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("src\\_16_io_test_file\\practice\\find_biggest_value_and_write_it_to_another_file\\number.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("D:\\CODEGYM\\C0222G1_Nguyen_Huu_Toan_Module2\\src\\_16_io_test_file\\practice\\find_biggest_value_and_write_it_to_another_file\\result.txt", maxValue);
    }
}
