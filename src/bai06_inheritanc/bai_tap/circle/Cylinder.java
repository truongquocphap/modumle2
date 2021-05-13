package bai06_inheritanc.bai_tap.circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return 2*Math.PI*this.getRadius()*this.height;
    }
    public double getvolumo(){
        return (Math.PI*Math.pow(this.getRadius(),2)*this.height);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + this.height +
                "height is a subclass of"+
                super.toString()+
                '}';
    }
}
