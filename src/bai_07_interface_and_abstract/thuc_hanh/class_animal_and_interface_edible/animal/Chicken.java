package bai_07_interface_and_abstract.thuc_hanh.class_animal_and_interface_edible.animal;

import bai_07_interface_and_abstract.thuc_hanh.class_animal_and_interface_edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken : cluck cluck";
    }

    @Override
    public String howtoEet() {
        return "could be fried";
    }
}
