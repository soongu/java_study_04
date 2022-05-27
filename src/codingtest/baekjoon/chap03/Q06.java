package codingtest.baekjoon.chap03;

import java.util.Scanner;

public class Q06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        for (int i = N; i > 0; i--) {
            System.out.println(i);
        }
    }
}
