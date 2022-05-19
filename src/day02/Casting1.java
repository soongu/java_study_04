package day02;

public class Casting1 {

    public static void main(String[] args) {

        byte a = 100; // 1바이트 할당

        int b = a; // a가 int로 자동 형 변환

        double c = b; // b가 double 자동 형 변환
        System.out.println("c = " + c);


    }
}
