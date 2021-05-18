package bai_12_collection_framework.baitap;

import java.util.Comparator;

public class ComparetorGiaTien implements Comparator<QLSP_ArrayList> {
    @Override
    public int compare(QLSP_ArrayList o1, QLSP_ArrayList o2) {
        if (o1.getGiaTien()>o2.getGiaTien()){
            return 1;
        }else if (o1.getGiaTien()==o2.getGiaTien()){
            return 0;
        }
        return -1;
    }
}
