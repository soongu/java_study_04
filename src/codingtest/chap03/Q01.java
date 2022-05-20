package codingtest.chap03;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        for (int line = 1; line <= 9; line++) {
            System.out.printf("%d * %d = %d\n", N, line, N * line);
        }
    }
}
