package sort;

import module.Room;

import java.util.Comparator;

public class TreeSetRoom implements Comparator<Room> {

    @Override
    public int compare(Room o1, Room o2) {
        return o1.getTenDichVu().compareTo(o2.getTenDichVu());
    }
}
