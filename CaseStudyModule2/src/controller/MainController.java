package controller;

import maneger.*;

import java.util.Scanner;

public class MainController {
    static Scanner scanner=new Scanner(System.in);
    public static void displayMainMenu(){

        while (true){
            System.out.println("chọn các chức năng \n" +
                    "1. add new services\n" +
                    "2. Show services\n" +
                    "3. add new customer\n" +
                    "4. show information of customer\n" +
                    "5. add new booking\n" +
                    "6. Show information of Employee\n" +
                    "7. Booking Ticket Movie \n" +
                    "8. exit");
            String menu=scanner.nextLine();
            switch (menu){
                case "1":
                    addNewServies();
                    break;
                case "2":
                    showServices();
                    break;
                case "3":
                    InputMethodCustomer.addNewCustomer();
                    break;
                case "4":
                    InputMethodCustomer.showCustomer();
                    break;
                case "5":
                    InputBooking.addNewBook();
                    break;
                case "6":
                    ShowEmployee.inputEmployeeMap();
                    break;
                case "7":
                    BookingTicketMovie.bookingTicket();
                    break;
                case "8":
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
                    InputMethodServies.addNewVilla();
                    break;
                case "2":
                    InputMethodServies.addNewHouse();
                    break;
                case "3":
                    InputMethodServies.addNewRoom();
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
                    ShowServices.showVilla();
                    break;
                case "2":
                    ShowServices.showHouse();
                    break;
                case "3":
                    ShowServices.showRoom();
                    break;
                case "4":
                    ShowServices.showNameVilla();
                    break;
                case "5":
                    ShowServices.showNameHouse();
                    break;
                case "6":
                    ShowServices.showNameRoom();
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


}
