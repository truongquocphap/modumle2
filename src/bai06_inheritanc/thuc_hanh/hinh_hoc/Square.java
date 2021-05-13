package bai06_inheritanc.thuc_hanh.hinh_hoc;

public class Square extends Rectangle{
    private double side;
    public Square(){

    }
    public Square(double side){
        super(side,side);
    }

   public Square(double side, String color, boolean filled){
        super(side,color,filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return this.side*4;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength1(double length) {
        super.setLength1(length);
    }

    @Override
    public String toString() {
        return "Square ưith {" +
                "side=" + getSide() +
                ", which is a subclass of "+
                "area: "+getArea()
                + super.toString()+
                "}";
    }
}
