package bai_5_access_modifierl.bai_tap;

import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;

public class Circle {
    private double radius=1.0;
    private String color="red";
    public Circle(){

    }
     protected Circle(double radius) {
        this.radius = radius;
    }
     protected void getRadius(){
        System.out.println("Radius: "+this.radius+" color: "+color);
    }
       protected void getArea(){
        System.out.println("Area : "+Math.pow(this.radius,2)*Math.PI+" color: "+color);
    }
//    public static class TestCircle{
//        public static void main(String[] args) {
//            Circle circle=new Circle(3.4);
//            circle.getRadius();
//            circle.getArea();
//        }
//    }
}
 class TestCircle{
    public static void main(String[] args) {
       Circle circle = new Circle(3.2);
       circle.getRadius();
       circle.getArea();
    }
}
