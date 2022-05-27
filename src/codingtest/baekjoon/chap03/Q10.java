package codingtest.baekjoon.chap03;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-1-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
