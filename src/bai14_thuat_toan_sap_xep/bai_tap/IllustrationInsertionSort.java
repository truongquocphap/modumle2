package bai14_thuat_toan_sap_xep.bai_tap;

public class IllustrationInsertionSort {
    public static void insertionSort(int[] list) {
        int insert;
        int index;
//        lặp tất cả các phần tử
        for (int j = 0; j < list.length; j++) {
//            chọn 1 giá trị để chèn.
            insert = list[j];
//            chọn vị trí để chèn.
            index = j;
//            kiểm tra sô liền trước nó có giá trị lớn hơn giá trị được chèn hay không.
            while (index > 0 && list[index - 1] > insert) {
                list[index] = list[index - 1];
                index--;
                System.out.println("Di chuyển phần tử :"+list[index]);
            }
            if (index != j) {
                System.out.println("chèn phần tử : "+ insert+ "tại vị trí " +index);
//              chèn phần tử tại vị trí cần chèn.
                list[index] = insert;
            }
            System.out.println("vòng lặp thứ "+j);
        }
    }

    public static void main(String[] args) {
//        tạo mảng để sort
        int[] arr={3,2,1,7,6,3,9,0,32,87};
//        gọi phương thức để thực hiện thuật toán sort
        insertionSort(arr);
//        in ra kết quả mảng đã được sắp xếp theo insertion sort
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
