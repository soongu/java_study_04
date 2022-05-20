package codingtest.chap02;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt(), M = sc.nextInt();
        int timer = sc.nextInt();
        sc.close();

        // timer를 시간과 분으로 분해하여
        // H값과 M값에 더해준다.
        H += timer / 60;
        M += timer % 60;

        // 분값 보정
        if (M >= 60) {
            H++;
            M -= 60;
        }

        // 시간값 보정
        if (H >= 24) {
            H -= 24;
        }

        System.out.printf("%d %d\n", H, M);
    }
}
