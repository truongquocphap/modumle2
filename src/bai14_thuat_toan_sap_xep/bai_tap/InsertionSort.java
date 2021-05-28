package bai14_thuat_toan_sap_xep.bai_tap;

public class InsertionSort {
    public static void insertionSort(int[] list) {
        int insert;
        int index;
        for (int j = 0; j < list.length; j++) {
            insert = list[j];
            index = j;
            while (index > 0 && list[index - 1] > insert) {
                list[index] = list[index - 1];
                index--;
            }
            if (index != j) {
                list[index] = insert;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={3,2,1,7,6,3,9,0,32,87};
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
