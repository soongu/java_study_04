package datastructure.chap03;

import java.util.Arrays;
import java.util.Scanner;

public class 구간_합_구하기1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 배열의 개수 N 과 테스트 케이스 M을 입력받아라
        int N = sc.nextInt(), M = sc.nextInt();

        long[] A = new long[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

//        int[] A = {5, 4, 3, 2, 1};
//        System.out.println(Arrays.toString(A));

        // 합배열 S 만들기
        // S[i] = S[i-1] + A[i]
        long[] S = new long[A.length + 1];
        for (int i = 1; i <= A.length; i++) {
            S[i] = S[i - 1] + A[i - 1];
        }
        //System.out.println(Arrays.toString(S));

        // 구간합 공식
        // (x, y) =>  S[y] - S[x-1]
        // (1, 3) =>  S[3] - S[0]

        // 1 ~ 3까지의 구간합
        //System.out.println(S[3] - S[0]);
        // 2 ~ 4까지의 구간합
        //System.out.println(S[4] - S[1]);

        for (int i = 0; i < M; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            System.out.println(S[y] - S[x - 1]);
        }
        sc.close();
    }

}
