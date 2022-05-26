package codingtest.chap06;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = s.charAt(0);
        sc.close();
        System.out.println((int) c);
    }
}
