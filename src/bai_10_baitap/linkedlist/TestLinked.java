package bai_10_baitap.linkedlist;

public class TestLinked {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        LinkedList<Student> linkedList = new LinkedList<Student>();
        Student student1=new Student(1,"anh");
        Student student2=new Student(1,"toan");
        Student student3=new Student(1,"thi");
        Student student4=new Student(1,"tho");
//         linkedList.addFist(student1);
         linkedList.addFist(student2);
         linkedList.addFist(student3);
        linkedList.addFist(student1);
//         linkedList.addLast(student1);
//         linkedList.add(2,student4);
//         linkedList.remove(student2);

//         LinkedList<Student>
//         newLinkedList = linkedList.clone();
//        for (int i = 0; i < newLinkedList.size(); i++) {
//            Student student= (Student) newLinkedList.get(i);
//            System.out.println(student.getName());
//        }

//        System.out.println(linkedList.constrains(student4));
//        System.out.println(linkedList.indexOf(student1));
        linkedList.clear();
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }


    }
}
