package bai15_exception_debug.baitap;

import java.util.Scanner;

public class IllegalTriangleException extends Triangle {


    public IllegalTriangleException() {
    }

    public IllegalTriangleException(double edgeA, double edgeB, double edgeC) throws IllegalTriangleException {
        super(edgeA, edgeB, edgeC);
        if ((edgeA + edgeB) > edgeC || (edgeA + edgeC) > edgeB || (edgeB + edgeC) > edgeA ||
                edgeA < 0 || edgeB < 0 || edgeC < 0) {
            throw new IllegalTriangleException("cac canh ban nhap vao khong phai la canh tam giac ");
        }else {

        }

    }
    public IllegalTriangleException(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}