package datastructure.chap04;

import java.util.Arrays;
import java.util.Scanner;

// 1253번
public class 투_포인터_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 수의 개수
        int count = 0; // 좋은 수의 개수

        // 수를 담을 배열
//        long[] A = {-3, -5, 1, 15, 4, 0, 7, 9, -2, 3};
        long[] A = new long[N];

        // 배열 초기화
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        sc.close();

        // 배열 정렬
        Arrays.sort(A);

//        System.out.println(Arrays.toString(A));

        // 모든 수를 순회하여 좋은 수인지 판단하기
        for (int i = 0; i < A.length; i++) {
            long target = A[i]; // 좋은 수 판단 타겟 숫자
            int start = 0, end = N - 1; // 포인터 초기화

            // 투 포인터 알고리즘
            while (start < end) {
                // 포인터가 지목한 두 수의 합
                long M = A[start] + A[end];
                if (M == target) { // 일단은 좋은 수
                    // 혹시 지금 나를 포함해서 더한게 아닌가
                    if (start == i) {
                        start++;
                    } else if (end == i) {
                        end--;
                    } else {
                        // 내가 아닌 두 수의 합
                        count++;
                        break;
                   }
                } else if (M < target) { // 두 수의 합이 타겟숫자보다 작으면
                    start++; // 타겟숫자에 가까워지려면 스타트가 움직여야 됨.
                } else {
                    end--;
                }
            } // end while
        } // end for

        System.out.println(count);

    }
}
