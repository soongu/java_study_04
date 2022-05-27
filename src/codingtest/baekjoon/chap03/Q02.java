package codingtest.baekjoon.chap03;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt(), B = sc.nextInt();
            System.out.println(A + B);
        }
        sc.close();
    }
}
