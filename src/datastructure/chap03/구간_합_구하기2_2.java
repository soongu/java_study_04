package datastructure.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 구간_합_구하기2_2 {

    public static void main(String[] args) throws IOException {

        // 준비
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));

        // 입력 처리
        // 1줄당 아래의 코드 삽입
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()),
                M = Integer.parseInt(st.nextToken());
        int[][] A = new int[N][N];

        // 원본 배열 A 채우기
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
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
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()),
                    y1 = Integer.parseInt(st.nextToken()),
                    x2 = Integer.parseInt(st.nextToken()),
                    y2 = Integer.parseInt(st.nextToken());

            System.out.println(D[x2][y2] - D[x1 - 1][y2] - D[x2][y1 - 1] + D[x1 - 1][y1 - 1]);
        }


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
