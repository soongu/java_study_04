package day19.lambda;

import utility.Util;

import java.util.ArrayList;
import java.util.List;

import static day19.lambda.Apple.Color.*;
import static day19.lambda.FilteringApple.*;

public class Main {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(80, GREEN));
        inventory.add(new Apple(155, GREEN));
        inventory.add(new Apple(120, RED));
        inventory.add(new Apple(90, GREEN));
        inventory.add(new Apple(110, RED));
        inventory.add(new Apple(50, RED));

        // 녹색 사과들만 필터링
        List<Apple> greens = filterGreenApples(inventory);
        for (Apple ga : greens) {
            System.out.println(ga);
        }
        Util.line();

        // 빨강 사과들만 필터링
        for (Apple ra : filterApplesByColor(inventory, RED)) {
            System.out.println(ra);
        }
        Util.line();

        // 무게가 100보다 큰 사과들만 필터링
        System.out.println("filtered apple weight over 100");
        for (Apple ha : filterApples(inventory, new AppleWeightPredicate())) {
            System.out.println(ha);
        }

        Util.line();

        System.out.println("filter with anonymous class");
        System.out.println("weight under 100");
        List<Apple> lightAppleList = filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() < 100;
            }
        });
        for (Apple la : lightAppleList) {
            System.out.println(la);
        }

        Util.line();

        System.out.println("빨간색이면서 100그램 이상인 사과들만 필터링");
        List<Apple> filteredList = filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor() == RED && apple.getWeight() >= 100;
            }
        });
        for (Apple apple : filteredList) {
            System.out.println(apple);
        }

        Util.line();

        Util.line();

        System.out.println("filter with lambda");
        System.out.println("weight under 100");
        List<Apple> lightAppleList2 = filterApples(inventory, a -> a.getWeight() < 100);

        for (Apple la : lightAppleList2) {
            System.out.println(la);
        }

        Util.line();

        System.out.println("빨간색이면서 100그램 이상인 사과들만 필터링");
        List<Apple> filteredList2 = filterApples(inventory, a -> a.getColor() == RED && a.getWeight() >= 100);
        for (Apple apple : filteredList2) {
            System.out.println(apple);
        }


        Extract ex = String::substring;

    }
}
