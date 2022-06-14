package codingtest.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class K번째수 {

    public static int[] solution(int[] array, int[][] commands) {
//        System.out.println(Arrays.toString(array));

        // 정답 배열
        int[] answer = new int[commands.length];

        // 2차원 배열을 반복하여 결과를 하나씩 추출
        for (int i = 0; i < commands.length; i++) {
            int a = commands[i][0] - 1; // 배열 슬라이싱 시작인덱스
            int b = commands[i][1]; // 배열 슬라이싱 끝인덱스
            int c = commands[i][2] - 1; // 정렬 후 결과값이 될 인덱스

            // 배열 슬라이싱 (배열 자르기)
            int[] slicedArr = new int[b - a];

            for (int j = 0; j < slicedArr.length; j++) {
                // 1번째 ~ 7번째 -> a : 0, b : 7
                // A[i] = B[i]

                // 2번째 ~ 5번째 -> a: 1, b : 5
                // A[i] = B[i+1]

                // 3번째 ~ 6번째 -> a: 2, b : 6
                // A[i] = B[i+2]
                slicedArr[j] = array[j + a];
            }
//            System.out.println(Arrays.toString(slicedArr));

            // 오름차 정렬
            Arrays.sort(slicedArr); // nlogn 시간복잡도 : 퀵소트

            // 정렬된 배열에서 결과값 확보
            int result = slicedArr[c];
            answer[i] = result;
        }

        return answer;
    }

    public static void main(String[] args) {




        int[] A = {1,5,2,6,3,7,4};
        int[][] B = {{2,5,3}, {4,4,1}, {1,7,3}};
        int[] solution = solution(A, B);
        System.out.println("Arrays.toString(solution) = " + Arrays.toString(solution));
    }
}
