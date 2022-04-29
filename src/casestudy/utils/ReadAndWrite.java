package casestudy.utils;

import casestudy.models.booking_contract.Booking;
import casestudy.models.facility.Facility;
import casestudy.models.facility.House;
import casestudy.models.facility.Room;
import casestudy.models.facility.Villa;
import casestudy.models.person.Customer;
import casestudy.models.person.Employee;

import java.io.*;
import java.util.*;

public class ReadAndWrite {
    public static String customerPath = "D:\\CODEGYM\\C0222G1_Nguyen_Huu_Toan_Module2\\src\\casestudy\\data\\customer.csv";
    public static String employeePath = "D:\\CODEGYM\\C0222G1_Nguyen_Huu_Toan_Module2\\src\\casestudy\\data\\employee.csv";
    public static String villaPath = "D:\\CODEGYM\\C0222G1_Nguyen_Huu_Toan_Module2\\src\\casestudy\\data\\villa.csv";
    public static String housePath = "D:\\CODEGYM\\C0222G1_Nguyen_Huu_Toan_Module2\\src\\casestudy\\data\\house.csv";
    public static String roomPath = "D:\\CODEGYM\\C0222G1_Nguyen_Huu_Toan_Module2\\src\\casestudy\\data\\room.csv";
    public static String facilityPath = "D:\\CODEGYM\\C0222G1_Nguyen_Huu_Toan_Module2\\src\\casestudy\\data\\facility.csv";
    public static String bookingPath = "D:\\CODEGYM\\C0222G1_Nguyen_Huu_Toan_Module2\\src\\casestudy\\data\\booking.csv";
    public static String contractPath = "D:\\CODEGYM\\C0222G1_Nguyen_Huu_Toan_Module2\\src\\casestudy\\data\\contract.csv";

    public static List<Customer> readFileCustomer() throws IOException {
        List<Customer> customerList = new LinkedList<>();
        File file = new File(customerPath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String[]> listStr = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] arrStr = line.split(",");
                listStr.add(arrStr);
            }
            for (String[] item : listStr) {
                Customer customer = new Customer(
                        Integer.parseInt(item[0]),
                        item[1],
                        item[2],
                        item[3],
                        Integer.parseInt(item[4]),
                        item[5],
                        Long.parseLong(item[6]),
                        item[7],
                        item[8]
                );
                customerList.add(customer);
            }
            return customerList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
            fileReader.close();
        }
        return null;
    }

    public static void writeFileCustomer(String line) throws IOException {
        File file = new File(customerPath);
        if (!file.exists()) {
            file.createNewFile();
        }
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> readFileEmployee() throws IOException {
        List<Employee> employeeList = new LinkedList<>();
        File file = new File(employeePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String[]> listStr = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] arrStr = line.split(",");
                listStr.add(arrStr);
            }
            for (String[] item : listStr) {
                Employee employee = new Employee(
                        Integer.parseInt(item[0]),
                        item[1],
                        item[2],
                        item[3],
                        Integer.parseInt(item[4]),
                        item[5],
                        Long.parseLong(item[6]),
                        item[7],
                        item[8],
                        item[9],
                        Long.parseLong(item[10])
                );
                employeeList.add(employee);
            }
            return employeeList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
            fileReader.close();
        }
        return null;
    }

    public static void writeFileEmployee(String line) throws IOException {
        File file = new File(employeePath);
        if (!file.exists()) {
            file.createNewFile();
        }
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Villa> readFileVilla() throws IOException {
        List<Villa> villaList = new LinkedList<>();
        File file = new File(villaPath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String[]> listStr = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] arrStr = line.split(",");
                listStr.add(arrStr);
            }
            for (String[] item : listStr) {
                Villa villa = new Villa(
                        item[0],
                        item[1],
                        Double.parseDouble(item[2]),
                        Double.parseDouble(item[3]),
                        Integer.parseInt(item[4]),
                        item[5],
                        item[6],
                        Double.parseDouble(item[7]),
                        Integer.parseInt(item[8])
                );
                villaList.add(villa);
            }
            return villaList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
            fileReader.close();
        }
        return null;
    }

    public static void writeFileVilla(String line) throws IOException {
        File file = new File(villaPath);
        if (!file.exists()) {
            file.createNewFile();
        }
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<House> readFileHouse() throws IOException {
        List<House> houseList = new LinkedList<>();
        File file = new File(housePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String[]> listStr = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] arrStr = line.split(",");
                listStr.add(arrStr);
            }
            for (String[] item : listStr) {
                House house = new House(
                        item[0],
                        item[1],
                        Double.parseDouble(item[2]),
                        Double.parseDouble(item[3]),
                        Integer.parseInt(item[4]),
                        item[5],
                        item[6],
                        Integer.parseInt(item[7])
                );
                houseList.add(house);
            }
            return houseList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
            fileReader.close();
        }
        return null;
    }

    public static void writeFileHouse(String line) throws IOException {
        File file = new File(housePath);
        if (!file.exists()) {
            file.createNewFile();
        }
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Room> readFileRoom() throws IOException {
        List<Room> roomList = new LinkedList<>();
        File file = new File(roomPath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String[]> listStr = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] arrStr = line.split(",");
                listStr.add(arrStr);
            }
            for (String[] item : listStr) {
                Room room = new Room(
                        item[0],
                        item[1],
                        Double.parseDouble(item[2]),
                        Double.parseDouble(item[3]),
                        Integer.parseInt(item[4]),
                        item[5]
                );
                roomList.add(room);
            }
            return roomList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
            fileReader.close();
        }
        return null;
    }

    public static void writeFileRoom(String line) throws IOException {
        File file = new File(roomPath);
        if (!file.exists()) {
            file.createNewFile();
        }
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Facility, Integer> readFileFacility() throws IOException {
        Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
        File file = new File(facilityPath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String[]> listStr = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] arrStr = line.split(",");
                listStr.add(arrStr);
            }
            for (String[] item : listStr) {
                if (item.length == 10) {
                    Villa villa = new Villa(
                            item[0],
                            item[1],
                            Double.parseDouble(item[2]),
                            Double.parseDouble(item[3]),
                            Integer.parseInt(item[4]),
                            item[5],
                            item[6],
                            Double.parseDouble(item[7]),
                            Integer.parseInt(item[8])
                    );
                    int count = Integer.parseInt(item[9]);
                    facilityIntegerMap.put(villa, count);
                } else if (item.length == 9) {
                    House house = new House(
                            item[0],
                            item[1],
                            Double.parseDouble(item[2]),
                            Double.parseDouble(item[3]),
                            Integer.parseInt(item[4]),
                            item[5],
                            item[6],
                            Integer.parseInt(item[7])
                    );
                    int count = Integer.parseInt(item[8]);
                    facilityIntegerMap.put(house, count);
                } else if (item.length == 7) {
                    Room room = new Room(
                            item[0],
                            item[1],
                            Double.parseDouble(item[2]),
                            Double.parseDouble(item[3]),
                            Integer.parseInt(item[4]),
                            item[5]
                    );
                    int count = Integer.parseInt(item[6]);
                    facilityIntegerMap.put(room, count);
                }
            }
            return facilityIntegerMap;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
            fileReader.close();
        }
        return null;
    }

    public static void writeFileFacility(String line) throws IOException {
        File file = new File(facilityPath);
        if (!file.exists()) {
            file.createNewFile();
        }
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static Set<Booking> readFileBooking() throws IOException {
        Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
        File file = new File(bookingPath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String[]> listStr = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] arrStr = line.split(",");
                listStr.add(arrStr);
            }
            for (String[] item : listStr) {
                Booking booking = new Booking(
                        Integer.parseInt(item[0]),
                        item[1],
                        item[2],
                        item[3],
                        item[4],
                        item[5],
                        item[6]
                );
                bookingSet.add(booking);
            }
            return bookingSet;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
            fileReader.close();
        }
        return null;
    }

    public static void writeFileBooking(String line) throws IOException {
        File file = new File(bookingPath);
        if (!file.exists()) {
            file.createNewFile();
        }
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFileContract(String line) throws IOException {
        File file = new File(contractPath);
        if (!file.exists()) {
            file.createNewFile();
        }
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
