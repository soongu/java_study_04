package com.kh.practice3.controller;

import com.kh.practice3.model.vo.Animal;
import com.kh.practice3.model.vo.Cat;
import com.kh.practice3.model.vo.Dog;

public class AnimalManager {

    public static void main(String[] args) {

        Animal[] animals = new Animal[5];
        animals[0] = new Dog("뽀삐", "푸들", 3);
        animals[1] = new Cat("나비", "코숏", "서울시 중구", "노랑색");
        animals[2] = new Cat("냥냥이", "러시안블루", "서울시 강서구", "회색");
        animals[3] = new Dog("불도긔", "불독", 5);
        animals[4] = new Dog("치치", "치와와", 2);


        for (Animal a : animals) {
            a.speak();
        }

    }
}
