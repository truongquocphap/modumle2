package bai15_exception_debug.thu_hanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public Integer[] createRandom(){
        Random random=new Random();
        Integer[] arr=new Integer[100];
        System.out.println("Danh sach phan tu cua mang:  ");
        for (int i = 0; i < 100; i++) {
            arr[i]=random.nextInt();
            System.out.println(arr[i]+ " ");
        }
        return arr;

    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsException arrException=new ArrayIndexOutOfBoundsException();
        Integer[] arr=arrException.createRandom();
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap chi so cua mot phan tu bat ky :");
        int number=Integer.parseInt(scanner.nextLine());
        try{
            System.out.println("Gia tri cua phan tu ban nhap cua so : "+ number +" la: "+arr[number]);
        }catch (Exception e){
            System.out.println("chi so vuot qua gioi hang cua mang");
        }
    }
}
