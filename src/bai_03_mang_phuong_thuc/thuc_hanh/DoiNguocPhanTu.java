package bai_03_mang_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class DoiNguocPhanTu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Short[] mang;
        int doDaiCuaMang;
        do {
            System.out.println("nhap do dai cua mang");
            doDaiCuaMang=input.nextShort();
            if (doDaiCuaMang>20){
                System.out.println("moi nhap lai do dai phai nho hon 20");
            }
        }while (doDaiCuaMang>20);
        mang=new Short[doDaiCuaMang];
        int i=0;
        while (i<mang.length){
            System.out.println("nhap cac phan tu cua mang"+(i+1));
            mang[i]=input.nextShort();
            i++;
        }
        System.out.println("cac phan tu ban vua nhap vao la: ");
        for (int j = 0; j < mang.length; j++) {
            System.out.println(mang[j]+"\t");
        }
        for (int k = 0; k < mang.length/2; k++) {
            Short temp=mang[k];
            mang[k]=mang[doDaiCuaMang-1-k];
            mang[doDaiCuaMang-1-k]=temp;
        }
        System.out.println("mang sau khi hoan doi la");
        for (int j = 0; j < mang.length; j++) {
            System.out.println(mang[j]+"\t");
        }
    }
}
