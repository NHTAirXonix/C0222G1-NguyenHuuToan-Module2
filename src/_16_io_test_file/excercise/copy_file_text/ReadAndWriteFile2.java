package _16_io_test_file.excercise.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReadAndWriteFile2 {

    public static List<String> readFile(String filePath) {
        List<String> arrayList = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                arrayList.add(line);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        System.out.println("Read file and get value complete");
        return arrayList;
    }

    public void copyFile(String filePath, List<String> arrayList) {
        int sum = 0;
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (String elements : arrayList) {
                bufferedWriter.write(elements + "\n");
                sum += elements.length();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Copy file complete");
        System.out.println("This file have " + sum + " character");
    }
}
