package datastructure.chap03;

public class 구간_합_구하기2 {

    public static void main(String[] args) {

        int N = 4;
        int[][] A = {
                {1, 2, 3, 4},
                {2, 3, 4, 5},
                {3, 4, 5, 6},
                {4, 5, 6, 7}
        };

        // 구간합 배열 D 구하기
        int[][] D = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i-1][j-1];
            }
        }

        // 예시 출력
        /*for (int[] ints : D) {
            for (int anInt : ints) {
                System.out.printf("%3d ", anInt);
            }
            System.out.println();
        }*/

        int x1 = 1, y1 = 1, x2 = 4, y2 = 4;

        System.out.println(D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1]);


        /*
            N(배열 크기) M(질의 수) 입력받아 저장하기
            for (N만큼 반복) {
                for (N만큼 반복) {
                    원본 배열에 정수 저장하기
                }
            }
            for (N만큼 반복) {
                for (N만큼 반복) {
                    구간 합 배열 저장하기
                    공식 : D[i][j] = D[i][j-1] + D[i-1][j] – D[i-1][j-1] + A[i][j]
                }
            }
            for (M만큼 반복) {
                질의 좌표 입력받고 계산 및 출력하기
                공식: D[x2][y2] – D[x1-1][y2] – D[x2][y1-1] + D[x1-1][y1-1]
            }
       */

    }
}
