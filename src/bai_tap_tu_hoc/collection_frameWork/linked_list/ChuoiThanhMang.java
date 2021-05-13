package bai_tap_tu_hoc.collection_frameWork.linked_list;
import java.util.LinkedList;
public class ChuoiThanhMang {
        public static void main(String[] args) {
            // khai báo 1 LinkedList có tên là list
            // có kiểu là String
            LinkedList<String> list = new LinkedList<String>();
            // thêm các phần tử vào list
            list.add("Java");
            list.add("C++");
            list.add("PHP");
            list.add("Java");

            // sử dụng phương thức toArray() chuyển list thành mảng
            // kết quả của phương thức này sẽ trả về mảng arr
            Object[] arr = list.toArray();

            // hiển thị các phần tử có trong mảng arr
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Phần tử tại vị trí " + i + " "
                        + "trong arr là " + arr[i]);
            }
        }
}
