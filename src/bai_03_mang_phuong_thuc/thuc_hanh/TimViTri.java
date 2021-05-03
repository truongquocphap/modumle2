package bai_03_mang_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class TimViTri {
    public static void main(String[] args) {
        String[] sinhVien={"Công","Pháp","Khuê","Linh","Thuý","Nguyên","Vinh"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap ten sinh vien ca tim: ");
        String ten_sinhVien=scanner.nextLine();
        boolean check=false;
        for (int i = 0; i <sinhVien.length; i++) {
            if (sinhVien[i].equals(ten_sinhVien)){
                System.out.println("vi tri cua sinh vien "+ten_sinhVien+" la: "+(i+1));
                check=true;
                break;
            }
        }
        if (!check){
            System.out.println("ten sinh vien nay khong nam trong danh sach "+ ten_sinhVien);
        }
    }
}
