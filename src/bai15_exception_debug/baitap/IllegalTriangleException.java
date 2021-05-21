package bai15_exception_debug.baitap;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
private double edgeA;
private double edgeB;
private double edgeC;
public String errorMessage;

    public IllegalTriangleException() {
    }

    public IllegalTriangleException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public IllegalTriangleException(double edgeA, double edgeB, double edgeC) throws IllegalTriangleException {
        if ((edgeA+edgeB)>edgeC || (edgeA+edgeC)>edgeB || (edgeB+edgeC)>edgeA ||
        edgeA<0 || edgeB<0 || edgeC<0){
            throw new IllegalTriangleException("cac canh ban nhap vao khong phai la canh tam giac ");
        }else {
            this.edgeA = edgeA;
            this.edgeB = edgeB;
            this.edgeC = edgeC;
        }

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
    public String getErrorMessage(){
        return errorMessage;
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