package BaiTap_TuHoc;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Studen {
    private String name;
    private String id;
    private String grade;
    private int age;
    private float avgMark;
    private float fee;
    private String email;
    private String phoneNumber;
    public void Study(String subject){

    }
    public void payFee(float amount){

    }
    public void doHomeWork(String subject){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Studen(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public Studen(String name, String id, String grade, int age, float avgMark, float fee,
                  String email, String phoneNumber) {
        this(name,id,age);
        this.grade = grade;
        this.avgMark = avgMark;
        this.fee = fee;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        Studen phap=new Studen("phap","bmq1112",20);
        System.out.println("Name: "+phap.getName());
        System.out.println("ID: "+phap.getId());
        System.out.println("Age: "+phap.getAge());
        Studen hau=new Studen("Hau","bh1223","Gioi",18,18.4f,300f,
                "doitoilacanhen@gmail.com","0966997711");
        System.out.println("Name: "+hau.getName());
        System.out.println("ID: "+hau.getId());
        System.out.println("Grade: "+hau.getGrade());
        System.out.println("Age: "+hau.getAge());
        System.out.println("Email: "+hau.getEmail());
        System.out.println("PhoneNumber: "+hau.getPhoneNumber());
    }


}
