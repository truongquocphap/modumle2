package sort;

import module.House;

import java.util.Comparator;

public class TreeSetHouse implements Comparator<House> {
    @Override
    public int compare(House o1, House o2) {
        return o1.getTenDichVu().compareTo(o2.getTenDichVu());
    }
}
