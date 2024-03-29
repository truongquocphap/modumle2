package bai_07_interface_and_abstract.bai_tap.resizeable;
import bai06_inheritanc.thuc_hanh.hinh_hoc.Circle;
public class CircleResize extends Circle implements Resizeable {

    public CircleResize(double radius) {
        this.setRadius(radius);
        this.getRadius();
    }

//        public void Area(){
//            System.out.println(this.getArea());
//        }
    @Override
    public void resize(double percent) {
        this.setRadius(this.getRadius()*Math.sqrt(1+percent/100));
        System.out.println("Cỉcle area: "+this.getRadius());
    }

    @Override
    public void area() {
        System.out.println("Cỉcle area: " +this.getArea());
    }
}
