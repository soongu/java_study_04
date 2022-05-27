package codingtest.baekjoon.chap06;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        // 알파벳 위치 배열
        int[] alphaPos = new int[26];
        // 배열값을 모두 -1로 초기화
        for (int i = 0; i < alphaPos.length; i++) {
            alphaPos[i] = -1;
        }

        for (int i = 0; i < S.length(); i++) {
            char c1 = S.charAt(i); // 'b' - 98
            if (alphaPos[c1 - 97] != -1) continue;
            alphaPos[c1 - 97] = i;
        }

        for (int n : alphaPos) {
            System.out.printf("%d ", n);
        }

        /*
        // 'b' -> 문자열에서는 0번 -> 알파벳배열 1번
        // 'a' -> 문자열에서는 1번 -> 알파벳배열 0번
        // 'e' -> 문자열에서는 2번 -> 알파벳배열 4번
        char c1 = S.charAt(0); // 'b' - 98
        alphaPos[1] = 0;

        char c2 = S.charAt(1); // 'a' - 97
        alphaPos[0] = 1;

        char c3 = S.charAt(2); // 'e' - 101
        alphaPos[4] = 2;

        char c4 = S.charAt(3); // 'k'
        alphaPos[10] = 3;

        char c5 = S.charAt(4); // 'j'
        alphaPos[9] = 4;

        char c6 = S.charAt(5); // 'o'
        alphaPos[14] = 5;

        char c7 = S.charAt(6); // 'o'
//        alphaPos[14] = 6;

        char c8 = S.charAt(7); // 'n'
        alphaPos[13] = 7;

         */

    }
}
