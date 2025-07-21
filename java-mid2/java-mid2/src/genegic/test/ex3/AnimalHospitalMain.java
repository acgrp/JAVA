package genegic.test.ex3;

import genegic.animal.Cat;
import genegic.animal.Dog;

public class AnimalHospitalMain {

    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        //개 병원
//        dogHospital.set(dog);
//        dogHospital.checkup();
//
//        catHospital.set(cat);
//        catHospital.checkup();

//        //문제2 : 개 타입반환
//        dogHospital.set(dog);
//        dogHospital.bigger(new Dog("멍멍이2", 200));
//        System.out.println("bigerdog" + dogHospital.bigger);
        }
    }
}
