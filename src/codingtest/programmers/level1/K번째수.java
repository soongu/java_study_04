package codingtest.programmers.level1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class K번째수 {

    public static int[] solution(int[] array, int[][] commands) {

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < commands.length; i++) {
            int a = commands[i][0] - 1; // 시작인덱스
            int b = commands[i][1]; // 끝인덱스
            int c = commands[i][2] - 1; // 가져올 값

            // 배열 자르기
            int[] targetArr = new int[b - a];
            for (int j = 0; j < targetArr.length; j++) {
                targetArr[j] = array[a + j];
            }
            Arrays.sort(targetArr);
//            System.out.println(Arrays.toString(targetArr));

            // 자른 배열에서 값 확보
            int result = targetArr[c];
//            System.out.println(result);
            queue.add(result);
        }
//        System.out.println(queue);
        int[] answer = new int[queue.size()];
        for (int i = 0; !queue.isEmpty(); i++) {
            answer[i] = queue.poll();
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
