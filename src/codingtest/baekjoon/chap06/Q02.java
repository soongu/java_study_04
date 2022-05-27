package codingtest.baekjoon.chap06;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        sc.close();

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int n = Integer.parseInt(String.valueOf(s.charAt(i)));
            sum += n;
        }
        System.out.println(sum);
        /*
        char c1 = s.charAt(0); // '5'
        String s1 = String.valueOf(c1); // "5"

        char c2 = s.charAt(1); // '4'
        String s2 = String.valueOf(c2); // "4"

        int n1 = Integer.parseInt(s1); // 5
        int n2 = Integer.parseInt(s2); // 4
        System.out.println(n1 + n2);
         */
    }
}
