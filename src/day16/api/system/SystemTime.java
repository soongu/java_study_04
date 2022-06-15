package day16.api.system;

import datastructure.chap06.bubble.BubbleSort;
import datastructure.chap06.insertion.InsertionSort;
import datastructure.chap06.selection.SelectionSort;
import datastructure.chap07.radix.RadixSort;
import utility.Util;

import java.util.Arrays;
import java.util.Date;

public class SystemTime {

    public static void main(String[] args) {

        // 현재 시간 읽기
        // 유닉스 시간 : 1970년 1월 1일 00시를 기준으로
        //             현재까지의 지나온 시간을 초로 표현
        long now = System.currentTimeMillis();
        System.out.println("now = " + now);

        Date date = new Date(now + (5 * 24 * 60 * 60 * 1000));
        System.out.println("date = " + date);

        Util.line();

        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }

        // 정렬 알고리즘 시간 테스트
        long s = System.currentTimeMillis();

//        BubbleSort.sort(arr); // 버블 정렬 : 4136ms
//        SelectionSort.sort(arr); // 선택 정렬 : 3768ms
//        InsertionSort.sort(arr); // 삽입 정렬 : 1828ms
//        RadixSort.sort(arr); // 기수 정렬 : 78ms
        Arrays.sort(arr);   // 퀵 정렬 : 16ms

        long e = System.currentTimeMillis();

        System.out.println((e - s) + "ms");

    }
}
