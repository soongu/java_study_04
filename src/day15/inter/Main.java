package day15.inter;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        // 인터페이스도 다형성이 적용됨.
        Dog dog = new Dog();
        Cat cat = new Cat();
        Shark shark = new Shark();
        Tiger tiger = new Tiger();
        BullDog bullDog = new BullDog();
        Rabbit rabbit = new Rabbit();

        Pet[] pets = {dog, cat, bullDog, rabbit};
        for (Pet pet : pets) {
            pet.play();
        }

        Violent[] violents = {rabbit, tiger, shark};
        for (Violent v : violents) {
            v.attack("zzz");
        }

        // 인터페이스를 통해 객체의 기능을 제한할 수 있다.
        Violent tokki = new Rabbit();
//        tokki.play();
        tokki.attack("주인");

        Queue<Integer> list = new LinkedList<>();

    }
}
