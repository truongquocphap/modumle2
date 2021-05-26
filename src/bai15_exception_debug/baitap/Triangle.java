package bai15_exception_debug.baitap;

public class Triangle extends  Exception{
    private double edgeA;
    private double edgeB;
    private double edgeC;
    public String errorMessage;

    public Triangle() {
    }

    public Triangle(double edgeA, double edgeB, double edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
    }

    public double getEdgeA() {
        return edgeA;
    }

    public void setEdgeA(double edgeA) {
        this.edgeA = edgeA;
    }

    public double getEdgeB() {
        return edgeB;
    }

    public void setEdgeB(double edgeB) {
        this.edgeB = edgeB;
    }

    public double getEdgeC() {
        return edgeC;
    }

    public void setEdgeC(double edgeC) {
        this.edgeC = edgeC;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    @Override
    public String toString() {
        return "IllegalTriangleException{" +
                "edgeA=" + edgeA +
                ", edgeB=" + edgeB +
                ", edgeC=" + edgeC +
                '}';
    }
}
