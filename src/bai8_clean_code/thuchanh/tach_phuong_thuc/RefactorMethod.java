package bai8_clean_code.thuchanh.tach_phuong_thuc;

public class RefactorMethod {
    public double getVolume(double radius, double height){

        double baseArea = getBaseArea(radius);
        System.out.println("base area: "+baseArea);
        double perimeter = getPerimeter(radius);
        System.out.println("perimeter: "+perimeter);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    private double getPerimeter(double radius) {
        return 2 * Math.PI  * radius;
    }

    private double getBaseArea(double radius) {
        return Math.PI * radius * radius;
    }
}
