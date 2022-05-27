package codingtest.baekjoon.chap04;

import java.util.Scanner;

public class Q06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 테스트 횟수

        // OX문자열을 저장할 배열
        String[] answerList = new String[N];
        for (int i = 0; i < N; i++) {
            answerList[i] = sc.next();
        }
        sc.close();

        for (String s : answerList) {

            int total = 0; //총점 누적
            int accum = 0; //누적 점수

            // 글자를 한글자마자 순회
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'O') {
                    if (i == 0 || s.charAt(i - 1) == 'X') {
                        accum = 1;
                    } else {
                        accum++;
                    }
                } else { // 글자가 X
                    accum = 0;
                }
                total += accum;
            }
            System.out.println(total);
        }

    }
}
