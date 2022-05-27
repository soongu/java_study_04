package codingtest.baekjoon.chap02;

import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        sc.close();

        // 가장 큰 눈 찾기
        int max = a;
        if (max < b) max = b;
        if (max < c) max = c;

        // 3개가 모두 같은 경우
        if (a == b && b == c) {
            System.out.println(10000 + a * 1000);
        }
        // 2개가 같은 경우
        else if (a == b || a == c) {
            System.out.println(1000 + a * 100);
        } else if (b == c) {
            System.out.println(1000 + b * 100);
        }
        // 모두 다른 경우
        else {
            System.out.println(max * 100);
        }
    }
}
