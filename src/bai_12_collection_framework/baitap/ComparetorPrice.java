package bai_12_collection_framework.baitap;

import java.util.Comparator;

public class ComparetorPrice implements Comparator<ManagerProduct> {
    @Override
    public int compare(ManagerProduct o1, ManagerProduct o2) {
        if (o1.getGiaTien()>o2.getGiaTien()){
            return 1;
        }else if (o1.getGiaTien()==o2.getGiaTien()){
            return 0;
        }
        return -1;
    }
}
