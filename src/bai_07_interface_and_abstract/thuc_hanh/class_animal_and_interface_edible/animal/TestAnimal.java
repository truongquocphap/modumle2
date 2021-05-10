package bai_07_interface_and_abstract.thuc_hanh.class_animal_and_interface_edible.animal;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal[]=new Animal[2];
        animal[0]=new Chicken();
        animal[1]=new Tiger();
        for (Animal animal1 : animal) {
            System.out.println(animal1.makeSound());
        }
    }
}
