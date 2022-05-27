package day08;

//import day08.fruit.Apple;
//import day08.fruit.Banana;
//import day08.fruit.Grape;

import day08.fruit.*;

public class Test {

    public static void main(String[] args) {

        Apple apple = new Apple();
        // 다른 패키지에 있는 클래스는 풀네임을 명시해야 한다.
        new Banana();
        new Grape();

        new java.util.Scanner(System.in);


    }
}
