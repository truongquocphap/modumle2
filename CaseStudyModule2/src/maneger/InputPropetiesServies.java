package maneger;

import controller.MainController;
import regular_Exception.RegulerException;
import regular_Exception.Viladate;

import java.util.Scanner;

public class InputPropetiesServies {
    static Scanner scanner = new Scanner(System.in);

    public static String nhapIDVilla() {
        System.out.println("mời nhập id Villa");

        while (true) {

            try {
                String idVilla = scanner.nextLine();
                Viladate.checkIDVilla(idVilla);
                return idVilla;
            } catch (RegulerException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static String nhapIDHouse() {
        System.out.println("mời nhập id House");

        while (true) {
            try {
                String idHouse = scanner.nextLine();
                Viladate.checkIDHouse(idHouse);
                return idHouse;
            } catch (RegulerException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static String nhapIDRoom() {
        System.out.println("mời nhập id Room");

        while (true) {
            try {
                String idRoom = scanner.nextLine();
                Viladate.checkIDRoom(idRoom);
                return idRoom;
            } catch (RegulerException e) {
                System.err.println(e.getMessage());
            }
        }

    }

    public static String tenDichVu() {
        System.out.println("mời nhập tên dịch vụ");

        while (true) {

            try {
                String nameService = scanner.nextLine();
                Viladate.checkName(nameService);
                return nameService;
            } catch (RegulerException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static String dienTichSuDung() {
        System.out.println("mời nhập diện tích sử dụng");

        while (true) {
            try {
                String areaUse = scanner.nextLine();
                Viladate.checkAreaPool(areaUse);
                return areaUse;
            } catch (RegulerException e) {
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
                Viladate.checkPositiveNumber(costsForRent);
                return costsForRent;
            } catch (RegulerException e) {
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
                Viladate.checkAmountPeople(amountPeople);
                return amountPeople;
            } catch (RegulerException e) {
                System.err.println(e.getMessage());
            }

        }
    }

    //    so tang
    public static String floorNumber() {
        System.out.println("mời nhập số tầng");
        while (true) {
            try {
                String floorNumber = scanner.nextLine();
                Viladate.checkPositiveNumber(floorNumber);
                return floorNumber;
            } catch (RegulerException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    //    kieu thue
    public static String modelRent() {
        System.out.println("mời nhập kiểu thuê");
        while (true) {
            System.out.println("nhập kiểu thuê theo danh sách\n" +
                    "1. thuê theo ngày\n" +
                    "2. thuê theo tháng\n" +
                    "3. thuê theo năm \n" +
                    "4. thuê theo giờ\n" +
                    "5. vê lại menu\n" +
                    "6. thoát");

            String kieuThue = scanner.nextLine();
            switch (kieuThue) {
                case "1":
                    System.out.println("nhập số ngày muốn thuê ");
                    while (true) {
                        try {
                            int nhapNgay = Integer.parseInt(scanner.nextLine());
                            String string = "" + nhapNgay;
                            return string;
                        } catch (NumberFormatException e) {
                            System.out.println("ký tự bạn nhập vào không phải là số mời bạn nhập lại");
                        }
                    }

                case "2":
                    System.out.println("nhập số tháng muốn thuê");
                    while (true) {
                        try {
                            int nhapThang = Integer.parseInt(scanner.nextLine());
                            String string = "" + nhapThang;
                            return string;
                        } catch (NumberFormatException e) {
                            System.out.println("ký tự bạn nhập vào không phải là số mời bạn nhập lại");
                        }
                    }
                case "3":
                    System.out.println("nhập số năm muốn thuê");
                    while (true) {
                        try {
                            int nhapNam = Integer.parseInt(scanner.nextLine());
                            String string = "" + nhapNam;
                            return string;
                        } catch (NumberFormatException e) {
                            System.out.println("ký tự bạn nhập vào không phải là số mời bạn nhập lại");
                        }
                    }
                case "4":
                    System.out.println("nhập số giờ muốn thuê");
                    while (true) {
                        try {
                            int nhapGio = Integer.parseInt(scanner.nextLine());
                            String string = nhapGio + " giờ";
                            return string;
                        } catch (NumberFormatException e) {
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
    public static String standard() {
        while (true) {
            System.out.println("mời nhập tiêu chuẩn theo danh sách theo danh sách\n" +
                    "1. * \n" +
                    "2. **\n" +
                    "3. ***\n" +
                    "4. ****\n" +
                    "5. *****\n" +
                    "6. trở lại menu\n" +
                    "7. thoát");
            String menu = scanner.nextLine();
            String standard = null;
            switch (menu) {
                case "1":
                    return standard = "*";
                case "2":
                    return standard = "**";
                case "3":
                    return standard = "***";
                case "4":
                    return standard = "****";
                case "5":
                    return standard = "*****";
                case "6":
                    MainController.displayMainMenu();
                case "7":
                    System.exit(0);
                default:
                    System.out.println("mời nhập theo dúng danh sách");

            }
        }

    }

    public static String birthday() {
        System.out.println("mời nhập ngày tháng năm sinh theo định dạng XX/XX/XXXX");
        while (true) {
            try {
                String birthday = scanner.nextLine();
                Viladate.checkBirthday(birthday);
                return birthday;
            } catch (RegulerException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static String dienTichHoBoi() {
        System.out.println(" nhập diện tích hồ bơi với định dạng phải lớn hơn 30m2");
        while (true) {
            try {
                String dienTichHoBoi = scanner.nextLine();
                Viladate.checkAreaPool(dienTichHoBoi);
                return dienTichHoBoi;
            } catch (RegulerException e) {
                System.err.println(e.getMessage());
            }
        }

    }

    public static String mienPhiDiKem() {
        while (true) {
            System.out.println("mời nhập dịch vụ đi kèm theo danh sách\n" +
                    "1. massage\n" +
                    "2. karaoke\n" +
                    "3. đồ uống \n" +
                    "4. thức ăn\n" +
                    "5. tham quan\n" +
                    "6. quay lại menu chính\n" +
                    "7. thoát");
            String menu=scanner.nextLine();
            String dichVu=null;
            switch (menu){
                case "1":
                    return dichVu="massage";
                case "2":
                    return dichVu="karaoke";
                case "3":
                    return dichVu="đồ uống";
                case "4":
                    return dichVu="thức ăn";
                case "5":
                    return dichVu="tham quan";
                case "6":
                    MainController.displayMainMenu();
                case "7":
                    System.exit(0);
                default:
                    System.out.println("mời nhập đúng theo danh sách");
            }
        }

    }
}
