package day17.generic;

import day08.modi.pac1.B;

public class Main {

    public static void main(String[] args) {

        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple());
        Apple apple = ab.getApple();

        BananaBasket bb = new BananaBasket();
        bb.setBanana(new Banana());
        Banana banana = bb.getBanana();

        Basket<Apple> ba = new Basket<>();
        ba.setFruit(new Apple());
        Apple a1 = ba.getFruit();

        Basket<Banana> bbb = new Basket<>();
        bbb.setFruit(new Banana());
        Banana b1 = bbb.getFruit();

        Basket<Grape> gb = new Basket<>();

//        Basket<Toy> tb = new Basket<>();
    }
}
