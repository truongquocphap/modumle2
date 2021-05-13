package bai_tap_tu_hoc.collection_frameWork;

import java.util.ArrayList;
import java.util.Collection;

public class Iterator {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("phap");collection.add("hoa");collection.add("khanh");
        collection.add("binh");
        java.util.Iterator<String> iterator=collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toUpperCase());
        }
    }


}
