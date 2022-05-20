package day03;

public class Loop01 {

    public static void main(String[] args) {

        // 정수 n을 입력하면 1부터 n까지
        // 가로로 출력하는 코드
        int n = 10;
        /*for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", i);
        }*/

        int i = 1;

        while (i <= n) {
            System.out.printf("%d ", i);
            i++;
        }


    }
}
