package bai_07_interface_and_abstract.thuc_hanh.class_animal_and_interface_edible;

import bai_07_interface_and_abstract.thuc_hanh.class_animal_and_interface_edible.animal.Animal;
import bai_07_interface_and_abstract.thuc_hanh.class_animal_and_interface_edible.animal.Chicken;
import bai_07_interface_and_abstract.thuc_hanh.class_animal_and_interface_edible.animal.Tiger;

public class TestAdible {
    public static void main(String[] args) {
        Animal animal[]=new Animal[2];
        animal[0]=new Tiger();
        animal[1]=new Chicken();
        for (Animal animal1 :
                animal) {
            System.out.println(animal1.makeSound());
            if (animal1 instanceof Chicken){
                Edible adible= (Chicken) animal1;
                System.out.println(adible.howtoEet());
            }
        }
        System.out.println("--------------");
        Fruit fruit[]=new Fruit[2];
        fruit[0]=new Apple();
        fruit[1]=new Orange();
        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i].howtoEet());
        }
    }
}
