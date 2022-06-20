package day19.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static day19.lambda.Apple.Color.GREEN;
import static day19.lambda.Apple.Color.RED;
import static java.util.Comparator.*;

public class Sorting {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(80, GREEN));
        inventory.add(new Apple(155, GREEN));
        inventory.add(new Apple(120, RED));
        inventory.add(new Apple(90, GREEN));
        inventory.add(new Apple(110, RED));
        inventory.add(new Apple(50, RED));

        // 가벼운 사과 순으로 정렬
        /*inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple a1, Apple a2) {
                return a1.getWeight() - a2.getWeight();
            }
        });*/

//        inventory.sort((a1, a2) -> a1.getWeight() - a2.getWeight());
//        inventory.sort(comparing(a -> a.getWeight()));
        inventory.sort(comparing(Apple::getWeight));

        // 내림차
        inventory.sort(comparing(Apple::getWeight).reversed());

        for (Apple apple : inventory) {
            System.out.println(apple);
        }

    }
}
