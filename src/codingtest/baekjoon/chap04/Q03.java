package codingtest.baekjoon.chap04;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 세 개의 정수 입력
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        // 세 수의 곱
        int multi = A * B * C;

        // 0부터 9까지의 등장 횟수를 카운팅해서 저장할 배열
        int[] countArr = new int[10];

        // 자리수 별로 숫자를 쪼개서 배열에 넣기

        while (multi > 0) {
            // 1의 자리수를 구하기 ex) 3645853
            int lastPosNum = multi % 10;
            countArr[lastPosNum]++; // 1의자리 숫자에 해당하는 배열카운트 증가

            // 한자리수 줄이기
            multi /= 10;
        }
//        System.out.println(Arrays.toString(countArr));

        for (int x : countArr) {
            System.out.println(x);
        }

    }
}
