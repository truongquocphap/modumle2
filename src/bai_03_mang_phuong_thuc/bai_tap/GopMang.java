package bai_03_mang_phuong_thuc.bai_tap;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1={3,4,5,6,7};
        int []arr2={12,3,45,67};
        int []arr3=new int[arr1.length+arr2.length];
        System.out.println("arr1 thu nhat la:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
            arr3[i]=arr1[i];
        }
        System.out.println("arr2 thu hai la:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
            arr3[(arr1.length)+i]=arr2[i];
        }
        System.out.println("so phan tu gop arr1 va arr2");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
