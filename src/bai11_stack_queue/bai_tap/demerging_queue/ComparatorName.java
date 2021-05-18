package bai11_stack_queue.bai_tap.demerging_queue;

import java.util.Comparator;

public class ComparatorName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getName().compareTo(o2.getName())==0){
            return o1.getDataOfBirth().compareTo(o2.getDataOfBirth());
        }
        return o1.getName().compareTo(o2.getName());
    }
}
