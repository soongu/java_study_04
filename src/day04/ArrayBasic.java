package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasic {

    public static void main(String[] args) {

        //1. 배열 변수 선언
        int[] arr;

        //2. 배열의 생성
        arr = new int[5];
        System.out.println(arr);

        //3. 배열값 초기화
        arr[0] = 30;
        arr[1] = 99;
        arr[2] = arr[0] + 20;
        arr[3] = (int) 66.7;
        arr[4] = 100;
//        arr[5] = 55;

        // 배열의 길이 - 저장 데이터 개수
        System.out.printf("배열의 길이: %d\n", arr.length);

        // 배열 내부 값 확인 - 루프 사용
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println(); // 줄바꿈
        System.out.println("========================");

        // 배열 전용 반복문 (향상된 for : Enhanced for Loop)
        for (int n : arr) {
            System.out.printf("%d ", n);
        }
        System.out.println("\n=======================");

        // 배열 내부값 출력 함수
        System.out.println(Arrays.toString(arr));


        // 값 목록을 나열하여 배열 생성하기
        int[] numbers = new int[] {10, 20, 30, 40};

        System.out.println(Arrays.toString(numbers));

        // new String[] 이런 구문은 배열변수 선언시에만 생략가능
        String[] foods = {"사과", "복숭아", "파인애플"};
        foods[1] = "수박";

        foods = new String[] {"짜장면", "탕수육", "짬뽕"};

        System.out.println(Arrays.toString(foods));

        // 배열을 생성만하고 초기화하지 않는다면
        // -> 해당 타입의 기본값으로 자동초기화됨.
        System.out.println("========================");

        double[] dArr = new double[3];

        System.out.println("dArr.length = " + dArr.length);
        System.out.println(Arrays.toString(dArr));

    }
}
