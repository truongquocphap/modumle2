package maneger;

import controller.MainController;
import regular_Exception.RegularException;

import java.util.Scanner;

public class InputPropeties {
    static Scanner scanner = new Scanner(System.in);

    public static String nhapIDVilla() {
        System.out.println("mời nhập id Villa");

        while (true) {

            try {
                String idVilla = scanner.nextLine();
                RegularException.checkIDVilla(idVilla);
                return idVilla;
            } catch (RegularException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static String nhapIDHouse() {
        System.out.println("mời nhập id House");

        while (true) {
            try {
                String idHouse = scanner.nextLine();
                RegularException.checkIDHouse(idHouse);
                return idHouse;
            } catch (RegularException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static String nhapIDRoom() {
        System.out.println("mời nhập id Room");

        while (true) {
            try {
                String idRoom = scanner.nextLine();
                RegularException.checkIDRoom(idRoom);
                return idRoom;
            } catch (RegularException e) {
                System.err.println(e.getMessage());
            }
        }

    }

    public static String tenDichVu() {
        System.out.println("mời nhập tên dịch vụ");

        while (true) {

            try {
                String nameService = scanner.nextLine();
                RegularException.checkName(nameService);
                return nameService;
            } catch (RegularException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static String dienTichSuDung() {
        System.out.println("mời nhập diện tích sử dụng");

        while (true) {
            try {
                String areaUse = scanner.nextLine();
                RegularException.checkAreaPool(areaUse);
                return areaUse;
            } catch (RegularException e) {
                System.err.println(e.getMessage());
            }
        }

    }

    //    method phi cho thue
    public static String costsForRent() {
        System.out.println("mời nhập chi phí cho thuê");
        while (true) {
            try {
                String costsForRent = scanner.nextLine();
                RegularException.checkPositiveNumber(costsForRent);
                return costsForRent;
            } catch (RegularException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    //    so luong nguoi
    public static String amountPeople() {
        System.out.println("mời nhập số lượng người tối đa");
        while (true) {
            try {
                String amountPeople = scanner.nextLine();
                RegularException.checkAmountPeople(amountPeople);
                return amountPeople;
            } catch (RegularException e) {
                System.err.println(e.getMessage());
            }

        }
    }
//    so tang
    public static String floorNumber(){
        System.out.println("mời nhập số tầng");
        while (true){
            try {
                String floorNumber=scanner.nextLine();
                RegularException.checkPositiveNumber(floorNumber);
                return floorNumber;
            } catch (RegularException e) {
                System.err.println(e.getMessage());
            }
        }
    }
//    kieu thue
    public static String modelRent(){
        System.out.println("mời nhập kiểu thuê");
        while (true){
            System.out.println("nhập kiểu thuê theo danh sách\n" +
                    "1. thuê theo ngày\n" +
                    "2. thuê theo tháng\n" +
                    "3. thuê theo năm \n" +
                    "4. thuê theo giờ\n" +
                    "5. vê lại menu\n" +
                    "6. thoát");

            String kieuThue=scanner.nextLine();
            switch (kieuThue){
                case "1":
                    System.out.println("nhập ngày muốn thuê ");
                    while (true){
                        try {
                            int  nhapNgay=Integer.parseInt(scanner.nextLine());
                            String string=""+ nhapNgay;
                            return string;
                        }catch (NumberFormatException e){
                            System.out.println("ký tự bạn nhập vào không phải là số mời bạn nhập lại");
                        }
                    }

                case "2":
                    System.out.println("nhập số tháng muốn thuê");
                    while (true){
                        try {
                            int  nhapThang=Integer.parseInt(scanner.nextLine());
                            String string=""+ nhapThang;
                            return string;
                        }catch (NumberFormatException e){
                            System.out.println("ký tự bạn nhập vào không phải là số mời bạn nhập lại");
                        }
                    }
                case "3":
                    System.out.println("nhập số năm muốn thuê");
                    while (true){
                        try {
                            int  nhapNam=Integer.parseInt(scanner.nextLine());
                            String string=""+ nhapNam;
                            return string;
                        }catch (NumberFormatException e){
                            System.out.println("ký tự bạn nhập vào không phải là số mời bạn nhập lại");
                        }
                    }
                case "4":
                    System.out.println("nhập số giờ muốn thuê");
                    while (true){
                        try {
                            int  nhapGio=Integer.parseInt(scanner.nextLine());
                            String string= nhapGio+" giờ";
                            return string;
                        }catch (NumberFormatException e){
                            System.out.println("ký tự bạn nhập vào không phải là số mời bạn nhập lại");
                        }
                    }
                case "5":
                    MainController.addNewServies();
                case "6":
                   System.exit(0);
                default:
                    System.out.println("mời bạn nhập lại theo đúng danh sách!!!!");
            }
        }

    }
//    tiêu chuẩn.
    public static String standard(){
        while (true){
            System.out.println("mời nhập theo danh sách\n" +
                    "1. * \n" +
                    "2. **\n" +
                    "3. ***\n" +
                    "4. ****\n" +
                    "5. *****\n" +
                    "6. trở lại menu\n" +
                    "7. thoát");
            String standerd=scanner.nextLine();
            switch (standerd){

            }
        }

    }
}
