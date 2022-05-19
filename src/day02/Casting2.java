package day02;

public class Casting2 {

    public static void main(String[] args) {

        // downcating : 하위 타입 변환
        // 다운캐스팅시 값의 손실이 일어날 수 있음.

        // 0011 1110 1000
        int n = 1000;
        byte m = (byte) n;

        System.out.println("m = " + m);

        double k = 5.556;
        int j = (int) k;
        System.out.println("j = " + j);
    }
}
