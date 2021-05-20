package bai14_thuat_toan_sap_xep.thuchanh;

public  class BubbleSort {
    static int[] list={2,4,5,3,2,6,4,6,389,453,-2};
   public BubbleSort(int[] list) {
        boolean needNextPass =true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass=false;
            for (int j = 0; j <list.length-1 ; j++) {
                if (list[j]>list[j+1]){
                    int temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                    needNextPass=true;
                }
            }

        }
    }

    public static void main(String[] args) {
       BubbleSort sort=new BubbleSort(list);
        for (int list: list
             ) {
            System.out.println(list+" ");
        }
    }

}
