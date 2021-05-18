package bai11_stack_queue.bai_tap.demerging_queue;

public class Student {
    private String name;
    private int age;
    private String dataOfBirth;
    private int mark;
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Student() {
    }

    public Student(String name, int age, String dataOfBirth, int mark,String gender) {
        this.name = name;
        this.age = age;
        this.dataOfBirth = dataOfBirth;
        this.mark = mark;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(String dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dataOfBirth='" + dataOfBirth + '\'' +
                ", mark=" + mark +
                ", anger=" +this.gender +
                '}';
    }
}
