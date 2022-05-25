package day06;

import java.util.Arrays;

public class MethodPractice {
    static String[] foods = {"떡볶이", "치킨", "파스타"};

    //배열에 마지막 위치에 데이터를 추가하는 함수
    static void push(String newFood) {
        String[] temp = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        temp[temp.length - 1] = newFood;
        foods = temp;
    }
    // 배열 내부데이터 출력함수
    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    static int indexOf(String targetName) {
        for (int i = 0; i < foods.length; i++) {
            if (targetName.equals(foods[i])) {
                return i;
            }
        }
        return -1;
    }
    static boolean include(String targetName) {
        return indexOf(targetName) != -1;
    }
    static void pop() {
        String[] temp = new String[foods.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = foods[i];
        }
        foods = temp;
    }

    static void remove(String targetName) {
        int index = indexOf(targetName);
        if (!include(targetName)) {
            System.out.println("존재하지 않는 음식명입니다");
            return;
        }
        for (int i = index; i < foods.length-1; i++) {
            foods[i] = foods[i+1];
        }
        pop();
    }

    static void modify(int targetIdx, String targetName) {
        foods[targetIdx] = targetName;
    }
    static void clear() {
        foods = new String[0];
    }
    static void insert(int targetIdx, String targetName) {
        String[] temp = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        for (int i = temp.length - 1; i > targetIdx; i--) {
            temp[i] = temp[i-1];
        }
        temp[targetIdx] = targetName;
        foods = temp;
    }

    public static void main(String[] args) {

        printFoods();
        push("라면");
        push("김치찌개");
        printFoods();

        // idx에 2가 리턴되어야 함.
        int idx = indexOf("파스타");
        // idx에 4가 리턴되어야 함.
        int idx2 = indexOf("김치찌개");
        // idx에 -1이 리턴되어야 함.
        int idx3 = indexOf("짜장면");

        remove("김치찌개"); // foods배열에서 김치찌개 제거
        remove("망고"); // 존재하지 않는 음식명입니다 출력.

        printFoods();
        /*

        boolean flag = include("파스타"); // 파스타 발견시 true 리턴
        boolean flag2 = include("양념치킨"); // 양념치킨 미발견시 false 리턴

        insert(3, "파인애플"); // 3번 인덱스에 파인애플 삽입
        modify(2, "닭갈비");  // 2번 인덱스 데이터 닭갈비로 수정
        clear();  // foods배열 모든 데이터 삭제

         */
    }
}
