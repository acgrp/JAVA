package genegic.test.ex3;

import genegic.animal.Animal;

public class AnimalHospital1 {

    private Animal animal;

    private void set(Animal animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름 " + animal.getName());
        System.out.println("동물 크기 " + animal.getSize());
        animal.sound();
    }

    public Animal bigger(Animal target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
