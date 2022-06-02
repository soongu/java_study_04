package datastructure.chap03;

import java.util.Scanner;

public class 구간_합_구하기2_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt();
        int[][] A = new int[N][N];

        // 원본 배열 A 채우기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // 구간합 배열 D 구하기
        int[][] D = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                D[i][j] = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + A[i - 1][j - 1];
            }
        }


        for (int i = 0; i < M; i++) {

            int x1 = sc.nextInt(),
                    y1 = sc.nextInt(),
                    x2 = sc.nextInt(),
                    y2 = sc.nextInt();

            System.out.println(D[x2][y2] - D[x1 - 1][y2] - D[x2][y1 - 1] + D[x1 - 1][y1 - 1]);
        }
        sc.close();


        /*
            N(배열 크기) M(질의 수) 입력받아 저장하기
            for (N만큼 반복) {
                for (N만큼 반복) {
                    원본 배열에 정수 저장하기
                }
            }
            for (N만큼 반복) {
                for (N만큼 반복) {
                    구간 합 배열 저장하기
                    공식 : D[i][j] = D[i][j-1] + D[i-1][j] – D[i-1][j-1] + A[i][j]
                }
            }
            for (M만큼 반복) {
                질의 좌표 입력받고 계산 및 출력하기
                공식: D[x2][y2] – D[x1-1][y2] – D[x2][y1-1] + D[x1-1][y1-1]
            }
       */

    }
}
