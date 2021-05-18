package bai_12_collection_framework.thuchanh;

public class ComparableStudentName extends Student implements java.lang.Comparable<Student> {
    public ComparableStudentName() {
    }

    public ComparableStudentName(String name, int age, String address) {
        super(name, age, address);
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
}
