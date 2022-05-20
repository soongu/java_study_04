package codingtest.chap02;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(), B = sc.nextInt();
        sc.close();

        if (A < B) {
            System.out.println("<");
        } else if (A > B) {
            System.out.println(">");
        } else {
            System.out.println("==");
        }
    }
}
