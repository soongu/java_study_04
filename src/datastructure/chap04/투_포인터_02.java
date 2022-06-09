package datastructure.chap04;
/*

  1. 오름차 정렬 - Arrays.sort(배열변수)
  2. s 를 첫위치 e를 끝위치에 둔다
  3. 찾는 수보다 합산 수가 작은 경우
     s를 오른쪽으로 한칸 이동
  4. 찾는 수보다 합산 수가 큰 경우
     e를 왼쪽으로 한칸 이동
  5. 찾는 수와 합산 수가 같은 경우
     count를 증가시키고 s++ , e--

*/

import java.util.Arrays;
import java.util.Scanner;

// 백준 1940
public class 투_포인터_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 재료의 개수
        int M = sc.nextInt(); // 갑옷이 완성되는 번호의 합
        int[] A = new int[N]; // 재료들

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();

        // 오름차 정렬
        Arrays.sort(A);
//        System.out.println(Arrays.toString(A));

        int count = 0; // 갑옷이 완성되는 경우의 수
        int start = 0; // 스타트 포인터의 초기 인덱스
        int end = N - 1; // 엔드 포인터의 초기 인덱스

        // 투 포인터 알고리즘
        // start와 end가 역전될 때까지
        while (start < end) {
            int sum = A[start] + A[end];
//            System.out.printf("start: %d, end: %d, sum: %d, M: %d\n"
//                                , start, end, sum, M);
            if (sum == M) { // 갑옷이 완성되는 경우
                count++; // 경우의 수 증가
                start++;
                end--;
            } else if (sum > M) {
                end--;
            } else {
                start++;
            }
        }
        System.out.println(count);

    }
}
