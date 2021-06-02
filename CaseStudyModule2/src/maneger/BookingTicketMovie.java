package maneger;

import common.ReadAndWrite;
import controller.MainController;
import module.Customer;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BookingTicketMovie {
   static Scanner scanner=new Scanner(System.in);
    public static void  bookingTicket(){
        Queue<String> customerQueue=new ArrayDeque<>();
        int count=0;
        String temp="";
        String menu=null;
        String listTicket="";
        while (true) {
            System.out.println("chọn menu theo danh sách\n" +
                    "1. Chọn tên quý khách trong danh sách sau đó hãy chờ trong hàng đợi\n" +
//                    "2. Chon để mua vé\n" +
                    "2. Kiểm tra đến lượt mình mua vé chưa\n" +
                    "3. show danh sách mua vé\n" +
                    "4. Quay lại menu\n" +
                    "5. Thoát ");
            menu =scanner.nextLine();
            switch (menu){
                case "1":
                    while (true) {
                        System.out.println();
                        List<Customer> customerList = ReadAndWrite.readFileCustomer("customer.txt");
                        for (int i = 0; i < customerList.size(); i++) {
                            System.out.println((i + 1) + " . " + customerList.get(i).showIndex());
                        }
                        System.out.println("mời bạn chọn thu tự tương ứng với tên của mình");
                        int index = Integer.parseInt(scanner.nextLine());
                        if (((index - 1) <= customerList.size())) {
                            temp = customerList.get(index - 1).getName();
                            customerQueue.add(temp);
                            break;
                        }

                        System.out.println("mời bạn nhập lại đúng với thứ tự trong danh sách");

                    }
                    break;
                case "2":
                    System.out.println(customerQueue.element());
                    System.out.println("nếu đúng tên bạn thì mời bạn bấm yes rồi mua vé sai bấm no ");
                    String check=scanner.nextLine();
                    if (check.equalsIgnoreCase("yes")){
                        System.out.println("mời bạn nhập số vé muốn mua và vé hôm nay cchỉ còn  "+(20-count));
                        int ticket=Integer.parseInt(scanner.nextLine());
                        if (count>20){
                            System.out.println("tổng số vé bán hôm nay đã hết mời bạn đến vào ngày mai");
                        }else {
                            listTicket+=customerQueue.element()+" số vé bạn đã chọn là "+ticket+ " vé \n";
                            count+=ticket;
                            customerQueue.remove();
                        }
                    }else {
                        break;
                    }
                    break;
                case "3":
                    if (listTicket!=""){
                        System.out.println(listTicket);
                    }else {
                        System.out.println("không có danh sách vé nào hiện tại");
                    }
                    break;
                case "4":
                    MainController.displayMainMenu();
                case "5":
                    System.exit(0);
                default:
                    System.out.println("mời bạn nhập theo đúng danh sách");
            }
        }

    }
}
