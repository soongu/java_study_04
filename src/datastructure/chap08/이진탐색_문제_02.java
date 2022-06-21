package datastructure.chap08;

import java.util.Scanner;

// 백준 2343
public class 이진탐색_문제_02 {

    public static int N;
    public static int M;

    public static int[] A;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); // 레슨의 수
        M = sc.nextInt(); // 블루레이의 수

        A = new int[N]; // 레슨 배열
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // 최대 길이의 레슨과, 레슨 길이 총합 구하기
        int start = 0, end = 0;
        for (int i = 0; i < N; i++) {
            if (start < A[i]) start = A[i];
            end += A[i];
        }

        int answer = 0; // 정답
        while (start <= end) {
            int mid = (start + end) / 2; // 블루레이의 크기
            if (isRightSize(mid)) {
                answer = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(answer);

    }

    private static boolean isRightSize(int mid) {
        int cnt = 0;
        int total = 0;
        for (int i = 0; i < N; i++) {
            if (total + A[i] > mid) { // 레슨크기의합이 사이즈보다 커지면
                cnt++; // 블루레이의 개수를 1개늘리고
                total = A[i]; // 새로운 그룹을 만든다
            } else {
                total += A[i];
            }
        }
        return cnt < M;
    }
}

