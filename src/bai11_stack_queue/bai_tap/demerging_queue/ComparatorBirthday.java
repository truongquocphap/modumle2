package bai11_stack_queue.bai_tap.demerging_queue;

import java.util.Comparator;

public class ComparatorBirthday implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getDataOfBirth().compareTo(o2.getDataOfBirth());
    }
}
