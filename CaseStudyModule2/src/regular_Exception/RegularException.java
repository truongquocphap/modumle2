package regular_Exception;

import java.time.LocalDate;
import java.util.Arrays;

public class RegularException extends Exception {
    public RegularException(String mess) {
        super(mess);
    }

    public static void checkName(String inputName) throws RegularException {
        String regexName = "^([A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễỬỮỰỲỴÝỶỸ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)(\\s[A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễỬỮỰỲỴÝỶỸ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)*$";
        if (!inputName.matches(regexName)) {
            throw new RegularException("tên nhập chưa đúng mời nhập lại: ký tự đầu phải viết hoa");
        }
    }

    public static void checkIDVilla(String id) throws RegularException {
        String regexID = "^SVVL-[0-9]{4}$";
        if (!id.matches(regexID)) {
            throw new RegularException("mời nhập theo định dạng SVVL-XXXX (XXXX là ký tự số gồm 4 chũ số)");
        }
    }

    public static void checkIDHouse(String id) throws RegularException {
        String regexID = "^HOVL-[0-9]{4}$";
        if (!id.matches(regexID)) {
            throw new RegularException("mời nhập theo định dạng HOVL-XXXX (XXXX là ký tự số gồm 4 chũ số)");
        }
    }

    public static void checkIDRoom(String id) throws RegularException {
        String regexID = "^ROVL-[0-9]{4}$";
        if (!id.matches(regexID)) {
            throw new RegularException("mời nhập theo định dạng ROVL-XXXX (XXXX là ký tự số gồm 4 chũ số)");
        }
    }

    //    check dien tich ho boi va dien tich su dung
    public static void checkAreaPool(String areaPool) throws RegularException {
        String regexAreaPool = "^[3-9][0-9]+.[0-9]m2$";
        if (!areaPool.matches(regexAreaPool)) {
            throw new RegularException("nhap sai định dạng mời nhập lại diện tích ít nhất là 30.0m2");
        }
    }

    //    check phi cho thue va so tang phai lon hon 0
    public static void checkPositiveNumber(String positiveNumber) throws RegularException {
        String regexPositiveNumber = "^[1-9]+";
        if (!positiveNumber.matches(regexPositiveNumber)) {
            throw new RegularException("nhập sai định dạng mời nhập lại.số phải lớn hơn 0");
        }
    }

    //    so luong nguoi
    public static void checkAmountPeople(String amountPeople) throws RegularException {
        String regexAmountPeople = "^(1[0-9]|[1-9]|20)$";
        if (!amountPeople.matches(regexAmountPeople)) {
            throw new RegularException("nhập sai định dạng mời nhập lại số phải lớn hơn 0 và nhỏ hơn 20");
        }
    }

    //năm sinh
    public static void checkBirthday(String namSinh) throws RegularException {
        String regexNamSinh = "(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(190[1-9]|19[1-9]\\d|2000|2001|2002)";

        if (!namSinh.matches(regexNamSinh)) {
            throw new RegularException("nhap sai dinh dang XX/XX/XXXX và  phải trên 18 tuổi");
        }
    }
//(\d{2}(0[48]|[2468][048]|[13579][26])|([02468][04s8]|[1359][26])00))$
    public static void checkEmail(String email) throws RegularException {
        String regexEmail = "^[_A-Za-z0-9]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        if (!email.matches(regexEmail)) {
            throw new RegularException("email nhập sai định dạng mời nhập lại theo định dạng abc@gmail.com (có thể thêm dấu . hoặc dấu _ ");
        }
    }

    public static String checkGender(String gioiTinh) throws RegularException {
        if (gioiTinh.equalsIgnoreCase("male") || gioiTinh.equalsIgnoreCase("Unknow") || gioiTinh.equalsIgnoreCase("female")) {
            String tempGender[] = gioiTinh.split("");
            String gender = "";
            gender += tempGender[0].toUpperCase();
            for (int i = 1; i < tempGender.length; i++) {
                gender += tempGender[i].toLowerCase();
            }
            return gender;
        } else {
            throw new RegularException("mời bạn nhập lại đúng với mẫu sau : Male , Female, Unknow");
        }
    }

    public static void checkIdCart(String idCart) throws RegularException {
        String regexIdCart = "^[0-9]{9}";
        if (!idCart.matches(regexIdCart)) {
            throw new RegularException("Id Card phải có 9 chữ số và theo định dạng XXXXXXXXX");
        }
    }

    public static void checkPhone(String phone)throws RegularException{
        String phoneNumber="^[0-9]{2}-0[0-9]{9}$";
        if (!phone.matches(phoneNumber)){
            throw new RegularException("nhập sai định dạng mời nhập lại bắt đầu XX-XXXXXXXXXX");
        }
    }

}
