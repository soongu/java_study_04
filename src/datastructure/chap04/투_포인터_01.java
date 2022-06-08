package datastructure.chap04;


import java.util.Scanner;

// 백준 2018번
public class 투_포인터_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 찾아야하는 부분합
        int[] arr = new int[N]; // 배열 생성
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        int start = 0, end = 0; // 시작포인터, 끝포인터
        int M = arr[start]; // 부분합을 저장
        int count = 0;  // M이 N이 되는 경우의 수

        while (end < N) {
//            System.out.printf("start: %d, end: %d, M: %d, count: %d\n"
//                                , start, end, M, count);
            if (M == N) {
                count++; // 원하는 합을 발견한 경우 경우의 수 증가
                end++;
                if (end < N) M += arr[end];
            } else if (M > N) {
                M -= arr[start];
                start++;
            } else {
                end++;
                M += arr[end];
            }
        }//end while

        System.out.println(count);
    }
}
