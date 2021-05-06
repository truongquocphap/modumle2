package bai_5_access_modifierl.thuc_hanh;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    @Override
    public String toString() {
        return
                "name '" + name + '\'' +
                ", engine '" + engine + '\'' ;
    }

}
