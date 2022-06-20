package day19.lambda;

import day13.poly.car.Car;

import java.util.ArrayList;
import java.util.List;

import static day19.lambda.Apple.*;
import static day19.lambda.Apple.Color.*;
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

    /**
     * @solution - try 3: 동작 파라미터화 - 추상적 조건으로 필터링
     *  a. 사과의 필터 조건에 따라 참 거짓을 반환하게하는 추상 메서드를
     *     가진 ApplePredicate 인터페이스를 정의한다.
     *  b. 특정 조건을 설정할 구현 클래스를 정의하고 기능을 오버라이딩
     *  c. 위 내용을 기반으로 필터 메서드들을 사용.
     *
     * @problem - 필터조건별 클래스가 너무 많아진다. 익명 클래스로 해결하면 된다.
     */

    // solution a
    @FunctionalInterface
    interface ApplePredicate {
        boolean test(Apple apple);
    }

    // solution b - 사과 무게가 100보다 큰지 확인
    static class AppleWeightPredicate implements ApplePredicate {

        @Override
        public boolean test(Apple apple) {
            return apple.getWeight() > 100;
        }
    }
    static class AppleColorPredicate implements ApplePredicate {

        @Override
        public boolean test(Apple apple) {
            return apple.getColor() == RED;
        }
    }

    // solution c
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> resultList = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                resultList.add(apple);
            }
        }
        return resultList;
    }
}
