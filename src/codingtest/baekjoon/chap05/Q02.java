package codingtest.baekjoon.chap05;

public class Q02 {

    // self-number 생성자 함수 d(n)

    // n -> 91  return 91 + 9 + 1 = 101
    // n -> 223 return 223 + 2 + 2 + 3 = 230
    static int d(int n) {

        int selfNum = n;
        while (n > 0) {
            selfNum += (n % 10);
            n /= 10;
        }
        return selfNum;
    }

    public static void main(String[] args) {

        /*
            d(1) => 2
            d(2) => 4
            d(3) => 6
            ...
            d(91) => 101
            d(92) => 103
            ..
            d(10000) => 10001
         */

        boolean[] proofs = new boolean[10000];

        for (int i = 1; i <= proofs.length; i++) {
            int d1 = d(i);
            if (d1 <= proofs.length) {
                proofs[d1 - 1] = true;
            }
        }

        // 셀프넘버 출력
        for (int i = 0; i < proofs.length; i++) {
            if (!proofs[i]) {
                System.out.println(i + 1);
            }
        }


    }
}
