package day19.lambda;

import day13.poly.car.Car;

import java.util.ArrayList;
import java.util.List;

import static day19.lambda.Apple.*;
import static day19.lambda.Apple.Color.GREEN;

// 사과 필터링 기능 클래스
public class FilteringApple {

    /**
     * @solution try 1 - 사과리스트에서 녹색 사과들만 필터링해주세요
     * @problem
     * - 만약 빨간색 사과를 필터링하고 싶다면??
     * - filterRedApples를 만들것이냐?
     * - 색깔이 더 다양하다면?
     */
    public static List<Apple> filterGreenApples(List<Apple> inventory) {

        List<Apple> resultList = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor() == GREEN) {
                resultList.add(apple);
            }
        }
        return resultList;
    }

    /**
     * @solution - try2 : 색을 파라미터화 한다.
     * @problem
     *  - 만약 필터기준이 색상이 아니라 무게라면?
     *  - 무게 파라미터를 가진 메서드 filterApplesByWeight를 만들건가?
     *  - 만약 필터기준이 색상 + 무게
     *  - 어차피 조건문 빼고 코드가 똑같을 것 같은데?
     */
    public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {

        List<Apple> resultList = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor() == color) {
                resultList.add(apple);
            }
        }
        return resultList;
    }
}
