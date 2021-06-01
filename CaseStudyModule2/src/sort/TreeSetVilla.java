package sort;

import common.ReadAndWrite;
import module.Villa;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetVilla implements Comparator<Villa> {
    @Override
    public int compare(Villa o1, Villa o2) {
        return o1.getTenDichVu().compareTo(o2.getTenDichVu());
    }
}
