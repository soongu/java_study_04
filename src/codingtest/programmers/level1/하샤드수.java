package codingtest.programmers.level1;

public class 하샤드수 {
    public static boolean solution(int x) {

        int dx = x; // 처음 x값 백업
        int sum = 0; //자리수 총합
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return dx % sum == 0;

    }

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(12));
        System.out.println(solution(11));
        System.out.println(solution(13));
    }
}
