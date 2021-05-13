package bai_tap_tu_hoc.collection_frameWork;

import java.util.*;

public class TestStream {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,4,5,6,12);
        Set<String> set= new HashSet<>();
        set.add("1");set.add("2");set.add("4");
        set.add("5");set.add("5");
        int sum =list.stream()
                .filter(value ->value>0)
                .mapToInt(value -> value)
                .sum();
        set.stream().forEach(s -> System.out.println(s));
        System.out.println(sum);
    }

}
