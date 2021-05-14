package bai_07_interface_and_abstract.bai_tap.resizeable;

import java.util.ArrayList;
import java.util.List;

public class TestResizeAble {
    public static void main(String[] args) {
        double randumSize=Math.floor((Math.random()*100)+1);
        List<Resizeable> resizeableList=new ArrayList<Resizeable>();
        resizeableList.add(new CircleResize(3.4));
        resizeableList.add(new Rectangel(4.5,3.6));
        resizeableList.add(new Squere(4.6));
//        CircleResize circle=new CircleResize( 3.4);
//       circle.resize(randumSize);

        System.out.println("mảng ban đầu là: ");
        for (Resizeable list: resizeableList
             ) {
            System.out.println(list);
        }

        System.out.println("kích thước diện tích ban đầu là: ");
        for (Resizeable list:resizeableList
             ) {
            list.area();
        }



        System.out.println("kích thước sau khi tăng là: ");
        for (Resizeable list: resizeableList
             ) {
            list.resize(randumSize);
        }
    }
}
