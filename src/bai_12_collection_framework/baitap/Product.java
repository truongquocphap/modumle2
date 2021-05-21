package bai_12_collection_framework.baitap;

import java.util.ArrayList;
import java.util.Collections;

public class Product {

    private String tenSP;
    private int id;
    private int giaTien;
    private String nhaSX;
    private int count=1;



    public Product() {
    }


    public Product(String tenSP, int id, int giaTien, String nhaSX) {
        this.tenSP = tenSP;
        this.id = id;
        this.giaTien = giaTien;
        this.nhaSX = nhaSX;

    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    @Override
    public String toString() {
        return "QLSP_ArrayList{" +
                "id='" + id + '\'' +
                ", tenSP=" + tenSP +
                ", giaTien=" + giaTien +
                ", nhaSX='" + nhaSX + '\'' +
                '}';
    }

}
