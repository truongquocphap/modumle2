package bai_5_access_modifierl.thuc_hanh;

public class TestStaticCar {
    public static void main(String[] args) {
        Car car1=new Car("Mazda 3","Skyactiv 3");
        System.out.println(Car.numberOfCars+" "+car1.toString());
        Car car2=new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCars+" "+car2.toString());
    }
}
