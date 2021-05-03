package bai_tap_tu_hoc;

public class TaoPhuongThuc_cat {
    private String name;
    private int age;
    private float weight;
    private String color;
    private String eyesColor;

    public TaoPhuongThuc_cat(){

    }

    public TaoPhuongThuc_cat(String name) {
        this.name = name;
    }

    public TaoPhuongThuc_cat(String name, int age) {
        this(name);
        this.age = age;
    }

    public TaoPhuongThuc_cat(String name, String eyesColor) {
        this(name);
        this.eyesColor = eyesColor;
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

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public static void main(String[] args) {
        TaoPhuongThuc_cat tom=new TaoPhuongThuc_cat("tom","red");
        System.out.println("cat's name: "+tom.getName());
        System.out.println("cat's age: "+tom.getAge());
        System.out.println("cat's color: "+tom.getEyesColor());
    }
}
