package module;

public class Employee {
    private String name;
    private String age;
    private String address;


    public Employee() {
    }

    public Employee(String name, String age, String address) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  name +
                "," + age +
                "," + address;
    }
    public void showInFor(){
        System.out.println("Employee{" +
                "name='" + name + '\'' +
                ", address='" + age + '\'' +
                ", age='" + address + '\'' +
                '}');
    }
}
