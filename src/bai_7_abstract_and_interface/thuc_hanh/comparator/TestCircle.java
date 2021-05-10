package bai_7_abstract_and_interface.thuc_hanh.comparator;

import bai06_access_modifiel.thuc_hanh.hinh_hoc.Circle;

import java.util.*;

public class TestCircle {
    public static void main(String[] args) {
        List<CircleComparator> circleList=new ArrayList<CircleComparator>();
        circleList.add(new CircleComparator("red",true,4.5));
        circleList.add(new CircleComparator("pink",true,2.4));
        circleList.add(new CircleComparator("yellow",true,5.6));
        System.out.println("pre--sort");
        for (CircleComparator cc: circleList
             ) {
            System.out.println(cc.toString());
        }

//            Comparator cctor=new CircleComparator();
//        Arrays.sort(circleList,cctor);
        Collections.sort(circleList, new Comparator<CircleComparator>() {
            @Override
            public int compare(CircleComparator o1, CircleComparator o2) {
                if (o1.getRadius()>o2.getRadius()) return 1;
                else if (o1.getRadius()<o2.getRadius()) return -1;
                else return 0;
            }
        });
        System.out.println("after sort");
        for (CircleComparator cc: circleList
             ) {
            System.out.println(cc.toString());
        }
    }

}
