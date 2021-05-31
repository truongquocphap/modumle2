package controller;

import common.ReadAndWrite;
import module.House;
import module.Room;
import module.Services;
import module.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    static Scanner scanner=new Scanner(System.in);
    public static void displayMainMenu(){
        System.out.println("chọn các chức năng \n" +
                "1. add new services\n" +
                "2. Show services\n" +
                "3. add new customer\n" +
                "4. show information of customer\n" +
                "5. add new booking\n" +
                "6. Show information of Employee\n" +
                "7. exit");
        String menu=scanner.nextLine();
        while (true){
            switch (menu){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                   System.exit(0);
                default:
                    System.out.println("mời nhập đúng theo danh sách đẫ cho");

            }
        }
    }
    public static void addNewServies(){

        while(true){
            System.out.println("mời bạn chọn danh theo danh sách: \n" +
                    "1. add new Villa\n" +
                    "2. add new House\n" +
                    "3. add new Room\n" +
                    "4. back to menu\n" +
                    "5. exit");
            String menu=scanner.nextLine();
            switch (menu){
                case "1":
                    addNewVilla();
                    break;
                case "2":
                    addNewHouse();
                    break;
                case "3":
                    addNewRoom();
                    break;
                case "4":
                    return;
                case "5":
                    System.exit(0);
                default:
                    System.out.println("mời bạn nhâp đúng theo danh sách đã cho");

            }
        }
    }
//    String tenDichVu, String dienTichSuDung, String chiPhiThue, String soLuongNguoiToiDa, String kieuThue
    public static void addNewVilla(){





        System.out.println("mời nhập tiêu chuẩn phòng");
        String tieuChuanPhong=scanner.nextLine();
        System.out.println("mời nhập mô tả tiện nghi khác");
        String moTaTienNghiKhac=scanner.nextLine();
        System.out.println("mời nhập diện tích hồ bơi");
        ;
        String soTang=scanner.nextLine();
        Villa villa=new Villa(tenDichVu,dienTichSuDung,phiChoThue,soLuongNguoiToiDa,kieuThue,tieuChuanPhong,moTaTienNghiKhac,dienTichHoBoi,soTang);
        List<Villa> villaList=new ArrayList<>();
        villaList.add(villa);
        ReadAndWrite.fileWriterVilla("villa.txt",true, villaList);
    }
    public static void addNewHouse(){

        System.out.println("mời nhập diện tích sử dụng");
        String dienTichSuDung=scanner.nextLine();
        System.out.println("mời nhập chi phí cho thuê");
        String phiChoThue=scanner.nextLine();
        System.out.println("mời nhập số lượng người tối đa");
        String soLuongNguoiToiDa=scanner.nextLine();
        System.out.println("mời nhập kiểu thuê");
        String kieuThue=scanner.nextLine();
        System.out.println("mời nhập tiêu chuẩn phòng");
        String tieuChuanPhong=scanner.nextLine();
        System.out.println("mời nhập mô tả tiện nghi khác");
        String moTaTienNghiKhac=scanner.nextLine();
        System.out.println("mời nhập số tầng");
        String soTang=scanner.nextLine();
        House house=new House(tenDichVu,dienTichSuDung,phiChoThue,soLuongNguoiToiDa,kieuThue,tieuChuanPhong,moTaTienNghiKhac,soTang);
        List<House> houseList=new ArrayList<>();
        houseList.add(house);
        ReadAndWrite.fileWriterHouse("house.txt",true, houseList);
    }
    public static void addNewRoom(){
        System.out.println("mời nhập tên dịch vụ");
        String tenDichVu=scanner.nextLine();
        System.out.println("mời nhập diện tích sử dụng");
        String dienTichSuDung=scanner.nextLine();
        System.out.println("mời nhập chi phí cho thuê");
        String phiChoThue=scanner.nextLine();
        System.out.println("mời nhập số lượng người tối đa");
        String soLuongNguoiToiDa=scanner.nextLine();
        System.out.println("mời nhập kiểu thuê");
        String kieuThue=scanner.nextLine();
        System.out.println("mời nhập miễn phí đi kèm");
        String mienPhiDiKem=scanner.nextLine();
        Room room=new Room(tenDichVu,dienTichSuDung,phiChoThue,soLuongNguoiToiDa,kieuThue,mienPhiDiKem);
        List<Room> roomList=new ArrayList<>();
        roomList.add(room);
        ReadAndWrite.fileWriterRoom("room.txt",true, roomList);
    }
    public static void showServices(){
        while (true){
            System.out.println("chọn menu danh sách hiển thị\n" +
                    "1. Show all villa\n" +
                    "2. Show all House\n" +
                    "3. Show all Room\n" +
                    "4. Show all Name Villa Not Duplicate\n" +
                    "5. Show all Name House Not Duplicate\n" +
                    "6. Show all Name Room Not Duplicate\n" +
                    "7. Back menu\n" +
                    "8. exit");
            String menu=scanner.nextLine();
            switch (menu){
                case "1":
                    showVilla();
                    break;
                case "2":
                    showHouse();
                    break;
                case "3":
                    showRoom();
                    break;
                case "4":
                    showNameVilla();
                    break;
                case "5":
                    showNameHouse();
                    break;
                case "6":
                    showNameRoom();
                    break;
                case "7":
                    displayMainMenu();
                case "8":
                    System.exit(0);
                default:
                    System.out.println("mời bạn nhập đúng theo tên danh sách");

            }
        }

    }
    public static void showVilla(){
        List<Villa> villaList=ReadAndWrite.readFileVilla("villa.txt");
        for (Villa villa: villaList){
            villa.showInfo();
        }
    }
    public static void showHouse(){
        List<House> houseList=ReadAndWrite.readFileHouse("house.txt");
        for (House house: houseList){
            house.showInfo();
        }
    }
    public static void showRoom(){
        List<Room> roomList=ReadAndWrite.readFileRoom("room.txt");
        for (Room room: roomList){
            room.showInfo();
        }
    }
    public static void showNameHouse(){
        List<House> houseList=ReadAndWrite.readFileHouse("house.txt");
        for (int i = 0; i < houseList.size(); i++) {
            System.out.println("House name:  "+(i+1)+". "+houseList.get(i).getTenDichVu());
        }
    }
    public static void showNameVilla(){
        List<Villa> villaList=ReadAndWrite.readFileVilla("villa.txt");
        for (int i = 0; i < villaList.size(); i++) {
            System.out.println("Villa name:  "+(i+1)+". "+villaList.get(i).getTenDichVu());
        }
    }
    public static void showNameRoom(){
        List<Room> roomList=ReadAndWrite.readFileRoom("house.txt");
        for (int i = 0; i < roomList.size(); i++) {
            System.out.println("Room name:  "+(i+1)+". "+roomList.get(i).getTenDichVu());
        }
    }

}
