package codingtest.baekjoon.chap03;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), X = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            if (A < X) System.out.printf("%d ", A);
        }

        sc.close();

    }
}
