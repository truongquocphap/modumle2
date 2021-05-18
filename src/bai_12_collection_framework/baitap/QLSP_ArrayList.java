package bai_12_collection_framework.baitap;

import bai_10_baitap.linkedlist.LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QLSP_ArrayList {
    private static ArrayList<QLSP_ArrayList> lists=new ArrayList<>();
    private String tenSP;
    private int id;
    private int giaTien;
    private String nhaSX;
    private int count=1;


    public QLSP_ArrayList() {
    }

    public QLSP_ArrayList(String tenSP, int id, int giaTien, String nhaSX) {
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
    public void showSP(){
        int count=1;
        Collections.sort(lists,new ComparetorGiaTien());
        for (QLSP_ArrayList sanPham: lists) {
            System.out.println(count+" : "+ sanPham.toString());
            count++;
        }

    }
    public  void addSP(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("nhap ten SP");
        String tenSP= scanner.nextLine();
        System.out.println("nhap nhaSX");
        String nhaSX=scanner.nextLine();
        System.out.println("nhap id SP");
        int idSP= scanner.nextInt();


        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).getId()==idSP){
                while (idSP==lists.get(i).getId()){
                    System.out.println("vi trung id voi san pham moi ban nhap lai");
                    idSP=scanner.nextInt();
                }
            }
        }



        System.out.println("nhap gia tien");
        int giaTien=scanner.nextInt();




        lists.add(new QLSP_ArrayList(tenSP,idSP,giaTien,nhaSX));
    }
    public void repairSP() throws Exception {
        if (lists.size()==0){
           throw new Exception("co phan tu nao dau ma sua");
        }
        Scanner scanner=new Scanner(System.in);
        showSP();
        System.out.println("chon phan tu muon sua id");
        int num=scanner.nextInt();
        System.out.println("nhap lai id moi");
        int id=scanner.nextInt();
        lists.get(num-1).setId(id);
        lists.get(num-1).getId();
    }
    public void erase(){
        if (lists.size()==0){
            System.out.println("co gi dau ma xoa");
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap id muon xoa");
        int id=scanner.nextInt();
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).getId()==id){
                lists.remove(lists.get(i));
            }
        }
    }
    public void search(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap ten ban muon tim kiem");
        String ten=scanner.nextLine();
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).getTenSP().equals(ten)){
                System.out.println("ten ban muon tim kiem la :"+ lists.get(i));
                return;
            }
        }
        System.out.println("ten ban vua nhap khong tim thay " + ten);
    }
}
