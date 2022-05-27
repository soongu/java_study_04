package codingtest.baekjoon.chap04;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 시험본 과목 수
        int N = sc.nextInt();

        // 조작전 시험 성적을 입력받아 배열에 저장
        int[] scoreList = new int[N];

        for (int i = 0; i < N; i++) {
            scoreList[i] = sc.nextInt();
        }
        sc.close();

        // 최고점수 찾기
        int max = scoreList[0];
        for (int i = 1; i < scoreList.length; i++) {
            if (scoreList[i] > max) max = scoreList[i];
        }

        // 점수 조작 (조작대상점수 / 최고점 * 100)
        // ex )   70 / 90 * 100 = 정수값

        // 조작한 점수들을 모아놓을 배열 생성
        double[] manipulatedArr = new double[scoreList.length];

        // 점수 조작 수행
        for (int i = 0; i < scoreList.length; i++) {
            manipulatedArr[i] = (double) scoreList[i] / max * 100;
        }
//        System.out.println(Arrays.toString(manipulatedArr));

        // 새로운 평균 구하기
        double total = 0.0;
        for (double s : manipulatedArr) {
            total += s;
        }
        double avg = total / manipulatedArr.length;
        System.out.println(avg);
    }
}
