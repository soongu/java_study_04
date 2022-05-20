package codingtest.chap02;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt(), M = sc.nextInt();
        sc.close();

        if (M >= 45) {
            System.out.printf("%d %d\n", H, M - 45);
        } else if (M < 45 && H >= 1) {
            System.out.printf("%d %d\n", H - 1, M + 15);
        } else {
            System.out.printf("%d %d\n", 23, M + 15);
        }
    }
}
