package genegic.test.ex3;

import genegic.animal.Animal;
import genegic.animal.Cat;
import genegic.animal.Dog;

public class CatHospital {

    private Cat animal;
    private final Animal target;

    {
        private Cat animal;

        public void set(Cat animal){
            this.animal = animal;
        }

        public void checkup() {
            System.out.println("동물 이름: " + animal.getName());
            System.out.println("동물 크기: " + animal.getSize());
            animal.sound();
        }
        public Cat bigger(Dog target) {
            return animal.getSize() > target.getSize() ? animal : target;
        }
    }
}
