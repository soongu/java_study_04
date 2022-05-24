package day05;

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {

        // 2차원 배열
        int[][] scores = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90},
                {33, 44, 55},
        };
        System.out.println(Arrays.toString(scores));
        System.out.println(scores[1]);
        System.out.println(Arrays.deepToString(scores));

        System.out.println("scores.length = " + scores.length);
        System.out.println("scores[1].length = " + scores[1].length);
        System.out.println("scores[2][1] = " + scores[2][1]);

        System.out.println(Arrays.toString(scores[0]));

        // 데이터 수정
        scores[2][1] = 777;
        scores[0] = new int[]{100, 200, 300};

        // 반복문 처리
        System.out.println("===================");

        /*for (int[] arr : scores) {
            for (int n : arr) {
                System.out.printf("%-4d ", n);
            }
            System.out.println();
        }*/
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.printf("%-4d ", scores[i][j]);
            }
            System.out.println();
        }

        System.out.println("=======================");

        // 배열 생성문으로 2차원배열 만들기 (3 x 5)
        int[][] arr2d = new int[3][5];

        arr2d[1][3] = 50;

        for (int[] ints : arr2d) {
            for (int anInt : ints) {
                System.out.printf("%-4d", anInt);
            }
            System.out.println();
        }

        // 3차원
        int[][][] arr3d = {
                {
                        {1, 2},
                        {3, 4},
                        {5, 6}
                },
                {
                        {7, 8},
                        {9, 10},
                        {11, 12}
                }
        };

        // 4 X 5 X 6 - 3차원배열
        int[][][] arr3d_2 = new int[4][5][6];
    }
}
