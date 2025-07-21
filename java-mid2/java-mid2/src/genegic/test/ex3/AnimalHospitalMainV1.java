package genegic.test.ex3;

import genegic.animal.Animal;
import genegic.animal.Cat;
import genegic.animal.Dog;

public class AnimalHospitalMainV1 {

    public static void main(String[] args) {
        AnimalHospital1 dogHospital = new AnimalHospital1();
        AnimalHospital1 catHospital = new AnimalHospital1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

//        개 병원
        dogHospital.set(dog);
        dogHospital.checkup();
//        개 병원에 고양이 전달

        catHospital.set(cat); //매개변수 체크 실패 : 컴파일 오류
        catHospital.checkup();

        //문제2 : 개 타입반환
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("bigerdog" + dogHospital.bigger);
        }
    }
}
