package maneger;

import common.ReadAndWrite;
import module.Customer;
import module.Villa;

import java.util.*;

public class InputMethodCustomer {
   static Scanner scanner=new Scanner(System.in);
   public static String addNewCustomer(){
       String name=InputPropetiesCustomer.inputName();
       String birthday=InputPropetiesCustomer.inputBirthday();
       String gender=InputPropetiesCustomer.inputGender();
       String idCart=InputPropetiesCustomer.inputIdCart();
       String phoneNumber=InputPropetiesCustomer.inputPhone();
       String email=InputPropetiesCustomer.inputEmail();
       String categoryGuest=InputPropetiesCustomer.inputCategoryGuest();
       String address=InputPropetiesCustomer.inputAddress();
       List<Customer> customerList=new ArrayList<>();
       Customer customer=new Customer(name,birthday,gender,idCart,phoneNumber,email,categoryGuest,address);
       customerList.add(customer);
       ReadAndWrite.fileWriterCustomer("customer.txt",true,customerList);
       return name;
   }
   public static void showCustomer(){
       List<Customer> customerList=ReadAndWrite.readFileCustomer("customer.txt");
       customerList.sort(Comparator.comparing(Customer::getName).thenComparing(Customer::getBirthday));
       for (Customer customer: customerList){
          customer.showInFor();
       }
   }
//   public static void getShow(){
//       List<Customer> customerList=ReadAndWrite.readFileCustomer("customer.txt");
//       for (int i=0; i<customerList.size(); i++){
//           System.out.println((i+1) + " . " +customerList.get(i).showIndex());
//       }
//   }
}
