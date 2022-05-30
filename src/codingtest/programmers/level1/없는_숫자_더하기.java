package codingtest.programmers.level1;

public class 없는_숫자_더하기 {

    public static int solution(int[] numbers) {

        // 0 ~ 9 총합 구하기
        int sum = 0;
        for (int i = 0; i <= 9; i++) {
            sum += i;
        }

        for (int n : numbers) {
            sum -= n;
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 6, 7, 8, 0};
        System.out.println(solution(nums));

        int[] nums2 = {5, 8, 4, 0, 6, 7, 9};
        System.out.println(solution(nums2));
    }
}
