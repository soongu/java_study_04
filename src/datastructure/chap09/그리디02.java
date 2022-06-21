package datastructure.chap09;

// 100-40+50+74-30+29-45+43+11
// 100 - 164 - 59 - 99 = -222
/*
     덧셈부분을 전부 괄호를 쳐서 먼저계산한 후
     뺄셈을 진행하면 최소값을 얻을 수 있을 것이다.
 */

import java.util.Scanner;
import java.util.StringTokenizer;

// 백준 1541
public class 그리디02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        StringTokenizer st = new StringTokenizer(str, "-");

        int result = 0;
        for (int i = 0; st.hasMoreTokens(); i++) {
            int addSum = calcTotal(st.nextToken());
            if (i == 0) {
                result += addSum;
            } else  {
                result -= addSum;
            }
        }
        System.out.println(result);
    }
    // 토큰문자열을 받아서 총합을 구해서 리턴
    private static int calcTotal(String token) {
        int total = 0;
        StringTokenizer st = new StringTokenizer(token, "+");
        while (st.hasMoreTokens()) {
            total += Integer.parseInt(st.nextToken());
        }
        return total;
    }
}
