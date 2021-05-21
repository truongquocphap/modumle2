package bai_12_collection_framework.baitap;

import java.util.Comparator;

public class ComparetorPrice implements Comparator<Product> {


    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getGiaTien()>o2.getGiaTien()){
            return 1;
        }else if (o1.getGiaTien()==o2.getGiaTien()){
            return 0;
        }
        return -1;
    }
}
