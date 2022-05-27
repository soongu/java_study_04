package codingtest.baekjoon.chap04;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9]; // 입력받은 정수들을 저장할 배열

        // 9만큼 반복해서 입력받은 정수를 순차적으로 배열에 초기화
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // 최대값을 저장할 변수
        int max = arr[0];
        // 위치를 저장할 변수
        int pos = 1;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i]; //최대값 갱신
                pos = i + 1; //위치값 갱신
            }
        }
        System.out.printf("%d\n%d", max, pos);
    }
}
