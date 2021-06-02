package maneger;

import controller.MainController;
import regular_Exception.RegulerException;
import regular_Exception.Viladate;

import java.util.Scanner;

public class InputPropetiesCustomer {
   static Scanner scanner=new Scanner(System.in);
   public static String inputName(){
       System.out.println("mời nhập tên");
       while (true){
           try {
               String name=scanner.nextLine();
               Viladate.checkName(name);
               return name;
           } catch (RegulerException e) {
               System.err.println(e.getMessage());
           }
       }
   }
    public static String inputBirthday(){
        System.out.println("mời nhap ngày tháng năm sinh theo định dạng XX/XX/XXXX");
        while (true){
            try {
                String birthday=scanner.nextLine();
                Viladate.checkBirthday(birthday);
                return birthday;
            } catch (RegulerException e) {
                System.err.println(e.getMessage());
            }
        }
    }
    public static String inputGender(){
        System.out.println("mời nhập giới tính Unknow ar Male or Female");
        while (true){
            try {
                String gender=null;
                String tempGender=scanner.nextLine();
               gender = Viladate.checkGender(tempGender);
                return gender;
            } catch (RegulerException e) {
                System.err.println(e.getMessage());
            }
        }
    }
    public static String inputIdCart(){
        System.out.println("mời nhập id cart định dạng 9 chữ số");
        while (true){
            try {
                String idCart=scanner.nextLine();
                Viladate.checkIdCart(idCart);
                return idCart;
            } catch (RegulerException e) {
                System.err.println(e.getMessage());
            }
        }
    }
    public static String inputPhone(){
        System.out.println("nhập số điện thoại ");
        while (true){
            try {
                String phoneNumber=scanner.nextLine();
                Viladate.checkPhone(phoneNumber);
                return phoneNumber;
            } catch (RegulerException e) {
                System.err.println(e.getMessage());
            }

        }
    }
    public static String inputEmail(){
        System.out.println("nhập email ");
        while (true){
            try {
                String email=scanner.nextLine();
                Viladate.checkEmail(email);
                return email;
            } catch (RegulerException e) {
                System.err.println(e.getMessage());
            }

        }
    }
    public static String inputAddress(){
        System.out.println("nhập số đia chi ");
        while (true){
            try {
                String address=scanner.nextLine();
                Viladate.checkName(address);
                return address;
            } catch (RegulerException e) {
                System.err.println(e.getMessage());
            }

        }
    }
//    loai khach
    public static String inputCategoryGuest(){
        String categoryGuest=null;
       while (true){
           System.out.println("mời chọn theo danh sách loại khách\n" +
                   "1. Diamond\n" +
                   "2. Platinium\n" +
                   "3. Gold\n" +
                   "4. Silver\n" +
                   "5. Member\n" +
                   "6. Quay lại menu\n" +
                   "7. Thoát");
           String menu=scanner.nextLine();

           switch (menu){
               case "1":
                  categoryGuest="Diamond";
                   return categoryGuest;
               case "2":
                   categoryGuest="Platinium";
                   return categoryGuest;
               case "3":
                   categoryGuest="Gold";
                   return categoryGuest;
               case "4":
                   categoryGuest="Silver";
                   return categoryGuest;
               case "5":
                   categoryGuest="Member";
                   return categoryGuest;
               case "6":
                   MainController.displayMainMenu();
               case "7":
                   System.exit(0);
               default:
                   System.out.println("mời nhập theo danh sách");
           }
       }
    }
}
