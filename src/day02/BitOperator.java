package day02;

public class BitOperator {

    public static void main(String[] args) {

        // 비트 연산자
        byte a = 5; // 0000 0101
        byte b = 3; // 0000 0011

        // & (비트곱) : 각 비트 자리수를 곱하세요.
        System.out.println(a & b); // 0000 0001  =  1
        // | (비트합) : 각 비트 자리수를 더하세요. 단 1+1=1로 처리
        System.out.println(a | b); // 0000 0111  =  7
        // ^ (배타적 논리합) : 각 비트 자리의 비트를 비교해서 다르면 1 같으면 0
        System.out.println(a ^ b); // 0000 0110  =  6

        // 비트 이동 연산
        // << : 왼쪽으로 이동 -> 2의 이동숫자만큼 제곱으로 곱해라
        // >> : 오른쪽으로 이동 -> 2의 이동숫자만큼 제곱으로 나눠라

        // 00000000 00000000 00000000 11000000
        int x = 192;
        // 00000000 00000000 00000110 00000000
        System.out.println(x << 3);
        // 00000000 00000000 00000000 00110000
        System.out.println(x >> 2);


        // 비트 반전 연산자 (~)
        int y = 8;              // 0000 1000
        System.out.println(~y); // 1111 0111

    }
}
