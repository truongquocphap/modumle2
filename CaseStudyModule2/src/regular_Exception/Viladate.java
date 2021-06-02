package regular_Exception;

public class Viladate {
//    public Viladate(String mess) {
//        super(mess);
//    }

    public static void checkName(String inputName) throws RegulerException {
        String regexName = "^([A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễỬỮỰỲỴÝỶỸ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)(\\s[A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễỬỮỰỲỴÝỶỸ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)*$";
        if (!inputName.matches(regexName)) {
            throw new RegulerException("tên nhập chưa đúng mời nhập lại: ký tự đầu phải viết hoa");
        }
    }

    public static void checkIDVilla(String id) throws RegulerException {
        String regexID = "^SVVL-[0-9]{4}$";
        if (!id.matches(regexID)) {
            throw new RegulerException("mời nhập theo định dạng SVVL-XXXX (XXXX là ký tự số gồm 4 chũ số)");
        }
    }

    public static void checkIDHouse(String id) throws RegulerException {
        String regexID = "^HOVL-[0-9]{4}$";
        if (!id.matches(regexID)) {
            throw new RegulerException("mời nhập theo định dạng HOVL-XXXX (XXXX là ký tự số gồm 4 chũ số)");
        }
    }

    public static void checkIDRoom(String id) throws RegulerException {
        String regexID = "^ROVL-[0-9]{4}$";
        if (!id.matches(regexID)) {
            throw new RegulerException("mời nhập theo định dạng ROVL-XXXX (XXXX là ký tự số gồm 4 chũ số)");
        }
    }

    //    check dien tich ho boi va dien tich su dung
    public static void checkAreaPool(String areaPool) throws RegulerException {
        String regexAreaPool = "^[3-9][0-9]+.[0-9]m2$";
        if (!areaPool.matches(regexAreaPool)) {
            throw new RegulerException("nhap sai định dạng mời nhập lại diện tích ít nhất là 30.0m2");
        }
    }

    //    check phi cho thue va so tang phai lon hon 0
    public static void checkPositiveNumber(String positiveNumber) throws RegulerException {
        String regexPositiveNumber = "^[1-9]+[0-9]*";
        if (!positiveNumber.matches(regexPositiveNumber)) {
            throw new RegulerException("nhập sai định dạng mời nhập lại.số phải lớn hơn 0");
        }
    }

    //    so luong nguoi
    public static void checkAmountPeople(String amountPeople) throws RegulerException {
        String regexAmountPeople = "^(1[0-9]|[1-9]|20)$";
        if (!amountPeople.matches(regexAmountPeople)) {
            throw new RegulerException("nhập sai định dạng mời nhập lại số phải lớn hơn 0 và nhỏ hơn 20");
        }
    }

    //năm sinh
    public static void checkBirthday(String namSinh) throws RegulerException {
        String regexNamSinh = "(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(190[1-9]|19[1-9]\\d|2000|2001|2002)";

        if (!namSinh.matches(regexNamSinh)) {
            throw new RegulerException("nhap sai dinh dang XX/XX/XXXX và  phải trên 18 tuổi");
        }
    }
//(\d{2}(0[48]|[2468][048]|[13579][26])|([02468][04s8]|[1359][26])00))$
    public static void checkEmail(String email) throws RegulerException {
        String regexEmail = "^[_A-Za-z0-9]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        if (!email.matches(regexEmail)) {
            throw new RegulerException("email nhập sai định dạng mời nhập lại theo định dạng abc@gmail.com (có thể thêm dấu . hoặc dấu _ ");
        }
    }

    public static String checkGender(String gioiTinh) throws RegulerException {
        if (gioiTinh.equalsIgnoreCase("male") || gioiTinh.equalsIgnoreCase("Unknow") || gioiTinh.equalsIgnoreCase("female")) {
            String tempGender[] = gioiTinh.split("");
            String gender = "";
            gender += tempGender[0].toUpperCase();
            for (int i = 1; i < tempGender.length; i++) {
                gender += tempGender[i].toLowerCase();
            }
            return gender;
        } else {
            throw new RegulerException("mời bạn nhập lại đúng với mẫu sau : Male , Female, Unknow");
        }
    }

    public static void checkIdCart(String idCart) throws RegulerException {
        String regexIdCart = "^[0-9]{9}";
        if (!idCart.matches(regexIdCart)) {
            throw new RegulerException("Id Card phải có 9 chữ số và theo định dạng XXXXXXXXX");
        }
    }

    public static void checkPhone(String phone)throws RegulerException {
        String phoneNumber="^[0-9]{2}-0[0-9]{9}$";
        if (!phone.matches(phoneNumber)){
            throw new RegulerException("nhập sai định dạng mời nhập lại bắt đầu XX-XXXXXXXXXX");
        }
    }

}
