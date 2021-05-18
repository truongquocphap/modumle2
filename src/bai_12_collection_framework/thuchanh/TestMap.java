package bai_12_collection_framework.thuchanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Smith",30);
        hashMap.put("Anderson",13);
        hashMap.put("Lewis",34);
        hashMap.put("Cook",15);
        System.out.println("display entries in HashMap");
        System.out.println(hashMap +"\n");


        Map<String,Integer> treeMap=new TreeMap<>(hashMap);
        System.out.println("display entries in ascending order of key");
        System.out.println(treeMap);


        Map<String,Integer> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put("Smith",21);
        linkedHashMap.put("Anderson",11);
        linkedHashMap.put("Lewis",23);
        linkedHashMap.put("Cook",25);
        System.out.println("the age for "+ "Lewis is "+ linkedHashMap.get("Lewis"));
    }
}
