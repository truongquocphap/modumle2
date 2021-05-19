package bai11_stack_queue.bai_tap.count_number;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap vao chuoi bat ki gom nhieu tu");
        String[] str = scanner.nextLine().trim().split("\\s+");
        System.out.println(" cac phan tu ban dau la: \n"+Arrays.toString(str));
        Map<String,Integer> countStr=new HashMap<>();
        for (String listKey :str) {
            listKey.toUpperCase();
            if (countStr.containsKey(listKey)){
                countStr.put(listKey,countStr.get(listKey)+1);
            }else {
                countStr.put(listKey,1);
            }
        }
        System.out.println(countStr);
    }
}
