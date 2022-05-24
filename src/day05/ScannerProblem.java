package day05;

import java.util.Scanner;

public class ScannerProblem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("정수: ");
        int n = sc.nextInt();
        // nextInt의 잔여공백을 처리하고 넘어가야함
        sc.nextLine();

        System.out.printf("문자열: ");
        String s = sc.nextLine();

        System.out.println("s = " + s);
        sc.close();

    }
}
