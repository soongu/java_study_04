package codingtest.baekjoon.chap04;

import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt(); //테스트 케이스 수

        for (int k = 0; k < C; k++) {
            int N = sc.nextInt(); //학생 수

            int[] scoreList = new int[N];

            for (int i = 0; i < N; i++) {
                scoreList[i] = sc.nextInt();
            }

            int total = 0;
            for (int s : scoreList) {
                total += s;
            }
            double avg = (double) total / scoreList.length;

            // 몇명이 평균을 넘었는지 확인
            int high = 0; // 평균 넘은 학생수 체크
            for (int i = 0; i < scoreList.length; i++) {
                if (scoreList[i] > avg) high++;
            }
            // 비율 계산
            double rate = (double) high / scoreList.length * 100;
            // 비율 출력
            System.out.printf("%.3f%%\n", rate);
        }
        sc.close();
    }
}
