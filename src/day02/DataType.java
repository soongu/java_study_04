package day02;

public class DataType {

    public static void main(String[] args) {

        // 정수 타입
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 2147483648L;

        System.out.println("d = " + d);

        int i;
        double n = 0.0;
        for(i = 0; i < 100; i++) {
            n += 0.1;
        }
        System.out.println("n = " + n);

        // 실수 타입
        float f1 = 1.2345678901234F; // 4byte
        double d1 = 1.2345678901234; // 8byte

        System.out.println("f1 = " + f1);
        System.out.println("d1 = " + d1);

        // 논리 타입
        boolean b1 = true;
        boolean b2 = false;

//        boolean b3 = TRUE;
//        boolean b4 = 0;
//        boolean b5 = "true";

//        while (true) {}

        // 문자 타입
        // 기본 타입 : char
        // 2byte할당, 음수개념 x, 글자 1글자만 저장가능

        char c1 = 'A';
        char c2 = 97;
        System.out.println("c2 = " + c2);

        // 문자열 타입 String
        // String은 기본타입이 아닙니다. 객체입니다.
        String s1 = "hello";

        // 문자 + 숫자 = 문자
        System.out.println(s1 + 300 + 120);

    }

}
