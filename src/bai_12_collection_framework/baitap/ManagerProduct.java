package bai_12_collection_framework.baitap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManagerProduct extends Product{
    private static ArrayList<Product> lists=new ArrayList<>();
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




        lists.add(new Product(tenSP,idSP,giaTien,nhaSX));
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
        int id=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).getId()==id){
                System.out.println("bạn  có chắc muốn xoá " + id +" này không?"
                +" 1: đồng ý."
                +" 2: chưa muốn xoá.");
                int check=Integer.parseInt(scanner.nextLine());
                if(check==1){
                    lists.remove(lists.get(i));
                }else {
                    System.out.println("id vua duoc nhap chua duoc xoa");
                    return;
                }

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
    public void showSP(){
        int count=1;
        Collections.sort(lists,new ComparetorPrice());
        for (Product sanPham: lists) {
            System.out.println(count+" : "+ sanPham.toString());
            count++;
        }

    }
}
