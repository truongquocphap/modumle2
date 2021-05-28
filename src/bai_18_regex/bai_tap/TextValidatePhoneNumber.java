package bai_18_regex.bai_tap;

import javax.swing.*;

public class TextValidatePhoneNumber {
    public static void main(String[] args) {
        String[] phoneNumber={"12-0988787652","23-03437362341"};
        String[] phoneNumber2={"a2-0988787652","23-93437362341"};
        for (int i = 0; i < phoneNumber.length; i++) {
            boolean isValid=ValidatePhoneNumber.validatePhoneNumber(phoneNumber[i]);
            System.out.println("phone number is "+phoneNumber[i] + " is valid "+isValid);
        }


        for (int i = 0; i < phoneNumber2.length; i++) {
            boolean isValid=ValidatePhoneNumber.validatePhoneNumber(phoneNumber2[i]);
            System.out.println("phone number is "+phoneNumber2[i] + " is valid "+isValid);
        }
    }


}
