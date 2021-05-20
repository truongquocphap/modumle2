package bai14_thuat_toan_sap_xep.thuchanh;

public class SelectionSort {
    public static void selectionSort(int [] list){
        for (int i = 0; i < list.length-1; i++) {
            int min=list[i];
            int index=i;
            for (int j = i+1; j < list.length; j++) {
                if (min >list[j]){
                    min =list[j];
                    index=j;
                }
            }
            if (index!=i){
                list[index]=list[i];
                list[i]=min;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={3,4,1,0,7,54,32,21,65};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
