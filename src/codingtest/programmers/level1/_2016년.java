package codingtest.programmers.level1;

public class _2016년 {
    public static String solution(int a, int b) {

        String[] weekDays = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        // 월별 총 일수
        int[] totalDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int dayCount = 0; // 누적 총 일수
        for (int i = 0; i < a - 1; i++) {
            dayCount += totalDays[i];
        }
        dayCount += b;
        return weekDays[dayCount % 7];
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 24));
    }
}
