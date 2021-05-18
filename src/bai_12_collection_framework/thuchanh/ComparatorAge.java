package bai_12_collection_framework.thuchanh;

public class ComparatorAge extends Student implements java.util.Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge()>o2.getAge()){
            return 1;
        }else if (o1.getAge()==o2.getAge()){
            return 0;
        }
        return -1;
    }
}
