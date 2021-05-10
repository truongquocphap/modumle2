package bai_07_interface_and_abstract.bai_tap.resizeable;
import bai06_access_modifiel.thuc_hanh.hinh_hoc.Circle;
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
        System.out.println(this.getRadius()*percent);
    }

    @Override
    public void Area() {
        System.out.println(this.getArea());
    }
}
