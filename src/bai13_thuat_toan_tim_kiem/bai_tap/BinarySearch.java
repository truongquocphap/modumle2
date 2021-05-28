package bai13_thuat_toan_tim_kiem.bai_tap;

class BinarySearch {
    int binarySearch(int array[], int x, int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (array[mid] == x)
                return mid;
            if (array[mid] > x)
                return binarySearch(array, x, low, mid - 1);
            if (array[mid]<x)
            return binarySearch(array, x, mid + 1, high);
        }
        return -1;
    }
    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int array[] = { 3, 4, 5, 6, 7, 8, 9 };
        int n = array.length;
        int result = ob.binarySearch(array, 9, 0, n - 1);
        if (result == -1)
            System.out.println("khong co phan tu trong mang");
        else
            System.out.println("phan tu ban tim co vi tri laf:  " + result);
    }
}

