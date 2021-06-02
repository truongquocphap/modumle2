package maneger;

import common.ReadAndWrite;
import controller.MainController;
import module.Customer;
import module.House;
import module.Room;
import module.Villa;

import java.util.List;
import java.util.Scanner;

public class InputBooking {

    static Scanner scanner = new Scanner(System.in);

    public static void addNewBook() {
        String luuThongTin="";
        while (true) {
            List<Customer> customerList = ReadAndWrite.readFileCustomer("customer.txt");
            for (int i = 0; i < customerList.size(); i++) {
                System.out.println((i + 1) + " . " + customerList.get(i).showIndex());
            }
            System.out.println("mời bạn chọn tự tương ứng với tên của mình");
            int index = Integer.parseInt(scanner.nextLine());
            if (((index - 1) <= customerList.size())) {
               luuThongTin+= "ten khach hang: " + customerList.get(index - 1).getName();
                break;
            }
            System.out.println("mời bạn nhập lại đúng với thứ tự trong danh sách");
        }
        while (true) {
            System.out.println("chọn danh sách dịch vụ \n" +
                    "1. booking Villa\n" +
                    "2. Booking House\n" +
                    "3. Booking Room\n" +
                    "4. Quay lại menu\n" +
                    "5. Thoát");
            String menu = scanner.nextLine();
            switch (menu) {
                case "1":
                    while (true) {
                        List<Villa> villaList = ReadAndWrite.readFileVilla("villa.txt");
                        for (int i = 0; i < villaList.size(); i++) {
                            System.out.println((i + 1) + " . " + villaList.get(i).showIndex());
                        }
                        System.out.println("mời bạn chọn tự tương ứng với tên của mình");
                        int index = Integer.parseInt(scanner.nextLine());
                        if (((index - 1) <= villaList.size())) {
                            ReadAndWrite.fileWriterBooking("booking.txt", true, luuThongTin +"ID Servies: " + villaList.get(index - 1).getId());
                            break;
                        }
                        System.out.println("mời bạn nhập lại đúng với thứ tự trong danh sách");

                    }
                    break;
                case "2":
                    while (true) {
                        List<House> houseList = ReadAndWrite.readFileHouse("house.txt");
                        for (int i = 0; i < houseList.size(); i++) {
                            System.out.println((i + 1) + " . " + houseList.get(i).showIndex());
                        }
                        System.out.println("mời bạn chọn tự tương ứng với tên của mình");
                        int index = Integer.parseInt(scanner.nextLine());
                        if (((index - 1) <= houseList.size())) {
                            ReadAndWrite.fileWriterBooking("booking.txt", true, luuThongTin + "ID Servies: " + houseList.get(index - 1).getId());
                            break;
                        }
                        System.out.println("mời bạn nhập lại đúng với thứ tự trong danh sách");

                    }
                    break;
                case "3":
                    while (true) {
                        List<Room> roomList = ReadAndWrite.readFileRoom("room.txt");
                        for (int i = 0; i < roomList.size(); i++) {
                            System.out.println((i + 1) + " . " + roomList.get(i).showIndex());
                        }
                        System.out.println("mời bạn chọn tự tương ứng với tên của mình");
                        int index = Integer.parseInt(scanner.nextLine());
                        if (((index-1)<= roomList.size())) {
                            ReadAndWrite.fileWriterBooking("booking.txt", true, luuThongTin + "ID Servies: " + roomList.get(index - 1).getId());
                            break;
                        }
                        System.out.println("mời bạn nhập lại đúng với thứ tự trong danh sách");

                    }
                    break;
                case "4":
                    MainController.displayMainMenu();
                case "5":
                    System.exit(0);
            }
        }
    }
}
