package TreeSet;

import module.Villa;

import java.util.Comparator;

public class TreeSetVilla implements Comparator<Villa> {
    @Override
    public int compare(Villa o1, Villa o2) {
        return o1.getTenDichVu().compareTo(o2.getTenDichVu());
    }
}
