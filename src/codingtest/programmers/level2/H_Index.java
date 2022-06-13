package codingtest.programmers.level2;

import java.util.Arrays;

public class H_Index {

    public static int solution(int[] citations) {
        int answer = 0;
        // 0, 1, 3, 5, 6
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= citations.length - i) {
                return citations.length - i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] A = {4, 0, 6, 1, 5};
        System.out.println(solution(A));
    }
}


