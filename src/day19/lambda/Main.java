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
    }
}
