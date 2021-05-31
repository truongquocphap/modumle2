package regular_Exception;

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
        String regexID="^SVVL-[0-9]{4}$";
        if (!id.matches(regexID)){
            throw new RegularException("mời nhập theo định dạng SVVL-XXXX (XXXX là ký tự số gồm 4 chũ số)");
        }
    }
    public static void checkIDHouse(String id) throws RegularException {
        String regexID="^HOVL-[0-9]{4}$";
        if (!id.matches(regexID)){
            throw new RegularException("mời nhập theo định dạng HOVL-XXXX (XXXX là ký tự số gồm 4 chũ số)");
        }
    }
    public static void checkIDRoom(String id) throws RegularException {
        String regexID="^ROVL-[0-9]{4}$";
        if (!id.matches(regexID)){
            throw new RegularException("mời nhập theo định dạng ROVL-XXXX (XXXX là ký tự số gồm 4 chũ số)");
        }
    }
//    check dien tich ho boi va dien tich su dung
    public static void checkAreaPool(String areaPool) throws RegularException {
        String regexAreaPool="^3[0-9]{2,}m2$";
        if (!areaPool.matches(regexAreaPool)){
            throw new RegularException("nhap sai định dạng mời nhập lại diện tích ít nhất là 30m2");
        }
    }
//    check phi cho thue va so tang phai lon hon 0
    public static void checkPositiveNumber(String positiveNumber) throws RegularException {
        String regexPositiveNumber="^[1-9][0-9]";
        if (!positiveNumber.matches(regexPositiveNumber)){
            throw new RegularException("nhập sai định dạng mời nhập lại.số phải lớn hơn 0");
        }
    }
//    so luong nguoi
    public static void checkAmountPeople(String amountPeople) throws RegularException {
        String regexAmountPeople="^(1[0-9]|[1-9]|20)$";
        if (!amountPeople.matches(regexAmountPeople)){
            throw new RegularException("nhập sai định dạng mời nhập lại số phải lớn hơn 0 và nhỏ hơn 20");
        }
    }

//    public static void check
}
