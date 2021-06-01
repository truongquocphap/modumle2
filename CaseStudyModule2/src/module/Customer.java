package module;

public class Customer {
    private String name;
    private String birthday;
    private String gender;
//    CMND
    private String identityCard;
    private String phoneNumber;
    private String email;
//    loaiKhac
    private String categoryGuest;
    private String address;

    public Customer() {
    }

    public Customer(String name, String birthday, String gender, String identityCard, String phoneNumber, String email, String categoryGuest, String address) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.identityCard = identityCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.categoryGuest = categoryGuest;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCategoryGuest() {
        return categoryGuest;
    }

    public void setCategoryGuest(String categoryGuest) {
        this.categoryGuest = categoryGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return   name +
                "," + birthday +
                "," + gender +
                "," + identityCard +
                "," + phoneNumber +
                "," + email +
                "," + categoryGuest +
                "," + address;
    }
    public void showInFor(){
        System.out.println("Customer{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", categoryGuest='" + categoryGuest + '\'' +
                ", address='" + address + '\'' +
                '}');
    }
    public String showIndex(){
        return "Customer{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", categoryGuest='" + categoryGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
